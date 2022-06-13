package com.assignment.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class SSNValidateException extends RuntimeException {
    public SSNValidateException(String failReason) {
        super("Validate ssn code fail, reason=" + failReason);
    }
}