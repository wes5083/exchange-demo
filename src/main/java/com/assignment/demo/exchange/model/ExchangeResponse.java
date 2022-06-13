package com.assignment.demo.exchange.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExchangeResponse extends  ExchangeRequest{
    private BigDecimal toAmount;
    private BigDecimal rate;
    public ExchangeResponse(String from, String to, BigDecimal fromAmount, BigDecimal toAmount, BigDecimal rate) {
        super(from,to,fromAmount);
        this.toAmount = toAmount;
        this.rate = rate;
    }
}
