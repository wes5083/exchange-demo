package com.assignment.demo.exchange.controller;


import com.assignment.demo.exchange.model.ExchangeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.assignment.demo.exchange.service.ExchangeRateService;

import java.math.BigDecimal;


@RestController
public class ExchangeRateController {
    @Autowired
    private ExchangeRateService exchangeRateService;

    @GetMapping("/api/exchange")
    public ResponseEntity<?> exchange(@RequestParam("from") String from,
                                      @RequestParam("to") String to,
                                      @RequestParam("fromAmount") BigDecimal fromAmount){
        return ResponseEntity.ok(exchangeRateService.convert(new ExchangeRequest(from, to, fromAmount)));
    }

}