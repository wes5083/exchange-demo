package com.assignment.demo.ssn.service;

import com.assignment.demo.common.Constants;
import com.assignment.demo.common.ResponseVo;
import com.assignment.demo.exception.SSNValidateException;
import com.assignment.demo.ssn.model.SSNValidateResponse;
import com.assignment.demo.ssn.util.ControlCharacterLocal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.GregorianCalendar;
import java.util.regex.Pattern;


@Service
@Slf4j
public class SSNValidateService {

    /**
     * for example ssn=131052-308T
     * day=13, month=10, 1952( because centuryCharacter value is - means 1900s)
     * centuryCharacter=-, means 1900s, + means 1800s, A means 2000s
     * individualNumber=308  between 002 to 899
     * controlCharacter is T 131052308%31 and left value rounded to the closest full number
     */
    public ResponseVo validate(String ssn, String countryCode) {
        try {
            if (StringUtils.hasLength(countryCode) && !Constants.SSN_VALIDATE_COUNTRY_CODE_FI.equals(countryCode)) {
                throw new SSNValidateException("CountryCode only support FI.");
            }

            // simple validate birthday & century character & individual number & control character
            String regex = "^[0-9]{6}[-+A][0-9]{3}[0-9A-Y]$";
            if (!Pattern.compile(regex).matcher(ssn).matches()) {
                throw new SSNValidateException(ssn + "regex not support");
            }

            String day = ssn.substring(0, 2);
            String month = ssn.substring(2, 4);
            String year = ssn.substring(4, 6);
            String centuryCharacter = ssn.substring(6, 7);
            String individualNumber = ssn.substring(7, 10);
            String controlCharacter = ssn.substring(10, 11);

            log.info("ssn code day={}, month={}, year={}, centuryCharacter={}, individualNumber={}, controlCharacter={}",
                    day, month, year, centuryCharacter, individualNumber, controlCharacter);

            validateBirthDate(day, month, year, centuryCharacter);
            validateIndividualNumber(individualNumber);
            // replace all not digit character
            validateControlCharacter(ssn.replaceAll("[^\\d.]", ""), controlCharacter);

            return ResponseVo.success(new SSNValidateResponse(true));
        } catch (Exception e) {
            log.error("validate ssn code exception", e);
            return ResponseVo.fail(e.getMessage(), new SSNValidateResponse(false));
        }

    }


    private void validateBirthDate(String day, String month, String year, String centuryCharacter) {
        String realYear = ("+".equals(centuryCharacter) ? "18" : ("-".equals(centuryCharacter) ? "19" : "20")).concat(year);
        log.info(realYear);
        if (realYear.matches("[18||19||20][0-9]{2}")) {
            throw new SSNValidateException("year number " + realYear + " only support 18, 19, 20");
        }

        SSNValidateException ssnException = new SSNValidateException("day number of " + day + month + realYear + " not exist");
        if (Integer.parseInt(month) == 2) {
            if (isLeapYear(realYear)) {
                // 01-29 day of month 2 when leap year
                if (!day.matches("0[1-9]||1[0-9]||2[0-9]")) {
                    throw ssnException;
                }
            } else {
                // 01-28 day of month 2 not leap year
                if (!day.matches("0[1-9]||1[0-9]||2[0-8]")) {
                    throw ssnException;
                }
            }
        } else if (month.matches("0[469]||11")) {
            // max day 30 on month 4,6,9,11
            if (!day.matches("0[1-9]||[12][0-9]||30")) {
                throw ssnException;
            }
        } else if (month.matches("0[13578]||1[02]")) {
            // max day 31 on month 1,3,5,7,8,10,12
            if (!day.matches("0[1-9]||[12][0-9]||3[01]")) {
                throw ssnException;
            }
        } else {
            throw ssnException;
        }

    }

    private boolean isLeapYear(String year) {
        int yearNum = Integer.parseInt(year);
        GregorianCalendar cal =
                (GregorianCalendar) GregorianCalendar.getInstance();
        return cal.isLeapYear(yearNum);
    }

    private void validateIndividualNumber(String individualNumber) {
        int individual = Integer.parseInt(individualNumber);
        if (individual > 899 || individual < 2) {
            throw new SSNValidateException("individual number " + individualNumber + " not right");
        }
    }

    private void validateControlCharacter(String ssnAllDigit, String controlCharacter) {
        int remainder = Integer.parseInt(ssnAllDigit) % 31;
        if (!controlCharacter.equals(ControlCharacterLocal.getControlCharacter(remainder))) {
            throw new SSNValidateException("control character " + controlCharacter + " not right");
        }
    }
}