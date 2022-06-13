package com.assignment.demo.exchange.service;

import com.assignment.demo.common.Constants;
import com.assignment.demo.common.ResponseVo;
import com.assignment.demo.exception.NoSuchCurrencyException;
import com.assignment.demo.exchange.model.*;
import com.assignment.demo.exchange.util.ExchangeRateLocal;
import com.assignment.demo.exchange.util.ExchangeSymbols;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;

@Service
@Slf4j
public class ExchangeRateService {

    @Autowired
    private ExchangeRateDataClient exchangeRateDataClient;

    public ResponseVo convert(ExchangeRequest request) {
        String from = request.getFrom();
        String to = request.getTo();
        BigDecimal fromAmount = request.getFromAmount();

        try {
            if (!isExists(from)) {
                throw new NoSuchCurrencyException(from);
            }
            if (!isExists(to)) {
                throw new NoSuchCurrencyException(to);
            }
            BigDecimal localRate = ExchangeRateLocal.get((from + Constants.SEPARATOR_COMMA_DASH + to));

            if (localRate == null || BigDecimal.ZERO.equals(localRate)) {
                ExchangeApiResponseConvertDTO res = exchangeRateDataClient.convert(from, to, fromAmount);
                log.info("Exchange API server covert from={} to={} fromAmount={} result={}", from, to, fromAmount, res);
                return ResponseVo.success(new ExchangeResponse(res.getQuery().getFrom(), res.getQuery().getTo(), res.getQuery().getAmount(), res.getResult(), res.getInfo().getRate()));
            } else {
                BigDecimal toAmount = fromAmount.multiply(localRate);
                return ResponseVo.success(new ExchangeResponse(from, to, fromAmount, toAmount, localRate));
            }
        } catch (Exception e) {
            log.error("exchange exception", e);
            return ResponseVo.fail(e.getMessage(),null);
        }

    }

    private boolean isExists(String symbol) {
        return StringUtils.hasLength(ExchangeSymbols.getSymbol(symbol));
    }

    public void SynLatestRate(String[] symbols) {
        for (String base : symbols) {
            ExchangeApiResponseLatestDTO res = exchangeRateDataClient.getLatestRate(base);
            log.info("Exchange API server latest rate base={} result={}", base, res);
            if (res == null || CollectionUtils.isEmpty(res.getRates())) {
                continue;
            }
            res.getRates().forEach((k, v) -> {
                ExchangeRateLocal.put((base + Constants.SEPARATOR_COMMA_DASH + k), v);
            });
        }
    }


}