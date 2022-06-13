package com.assignment.demo.exchange.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExchangeRequest {
    private String from;
    private String to;
    private BigDecimal fromAmount;

    public ExchangeRequest(String from, String to, BigDecimal fromAmount) {
        this.from = from;
        this.to = to;
        this.fromAmount = fromAmount;
    }
}
