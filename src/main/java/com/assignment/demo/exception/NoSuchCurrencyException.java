package com.assignment.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoSuchCurrencyException extends RuntimeException {
    public NoSuchCurrencyException(String currencyCode) {
        super("Currency code=" + currencyCode + " not support");
    }
}
