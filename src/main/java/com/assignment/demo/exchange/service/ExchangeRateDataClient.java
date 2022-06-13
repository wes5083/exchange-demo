package com.assignment.demo.exchange.service;

import com.assignment.demo.exchange.config.FeignClientConfiguration;
import com.assignment.demo.exchange.model.ExchangeApiResponseConvertDTO;
import com.assignment.demo.exchange.model.ExchangeApiResponseLatestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "exchangeRateDataClient",
        url = "${exchange.rates.data.api.domain}",
        configuration = FeignClientConfiguration.class
)
public interface ExchangeRateDataClient {
    @RequestMapping(method = RequestMethod.GET, value = "${exchange.rates.data.api_latest}", headers = {"apikey=${exchange.rates.data.api.key}"})
    ExchangeApiResponseLatestDTO getLatestRate(@RequestParam("base") String baseSymbol);

    @RequestMapping(method = RequestMethod.GET, value="${exchange.rates.data.api_convert}", headers = {"apikey=${exchange.rates.data.api.key}"})
    ExchangeApiResponseConvertDTO convert(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("amount") BigDecimal amount);
}
