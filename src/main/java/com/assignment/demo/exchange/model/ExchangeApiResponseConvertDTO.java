package com.assignment.demo.exchange.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties
public class ExchangeApiResponseConvertDTO {
    private boolean success;
    private String date;
    private BigDecimal result;
    private Query query;
    private Info info;

    public Query getQuery() {
        return query;
    }
    public Info getInfo() {
        return info;
    }

    @lombok.Data
    public static class Query {
        private String from;
        private String to;
        private BigDecimal amount;
    }
    @lombok.Data
    public static class Info {
        private Long timestamp;
        private BigDecimal rate;
    }
}
