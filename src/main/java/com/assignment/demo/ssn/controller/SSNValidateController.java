package com.assignment.demo.ssn.controller;

import com.assignment.demo.common.Constants;
import com.assignment.demo.common.ResponseVo;
import com.assignment.demo.ssn.service.SSNValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SSNValidateController {
    @Autowired
    private SSNValidateService sSNValidateService;

    @GetMapping("/api/ssn/validate")
    public ResponseEntity<?> validate(@RequestParam("ssn") String ssn,
                                      @RequestParam("countryCode") String countryCode) {
        return ResponseEntity.ok(sSNValidateService.validate(ssn, countryCode));
    }

}