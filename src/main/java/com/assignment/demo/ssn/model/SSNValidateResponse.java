package com.assignment.demo.ssn.model;

import lombok.Data;

@Data
public class SSNValidateResponse {
    private boolean ssnValidateResult;
    public SSNValidateResponse(boolean ssnValidateResult){
        this.ssnValidateResult = ssnValidateResult;
    }
}
