package com.assignment.demo.exchange.util;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.*;

public class ExchangeRateLocal {

    private final static Map<String, BigDecimal> exchangeRateMap = new ConcurrentHashMap<>();

    public static void put(String key, BigDecimal value) {
        exchangeRateMap.put(key, value);
    }

    public static BigDecimal get(String key) {
        return exchangeRateMap.get(key);
    }



}
