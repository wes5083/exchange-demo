package com.assignment.demo.ssn.util;

import java.util.HashMap;
import java.util.Map;

public class ControlCharacterLocal {
    private static final Map<Integer, String> controlCharacterMap;

    public static String getControlCharacter(Integer key) {
        return controlCharacterMap.get(key);
    }

    static {
        controlCharacterMap = new HashMap<>();
        controlCharacterMap.put(0, "0");
        controlCharacterMap.put(1, "1");
        controlCharacterMap.put(2, "2");
        controlCharacterMap.put(3, "3");
        controlCharacterMap.put(4, "4");
        controlCharacterMap.put(5, "5");
        controlCharacterMap.put(6, "6");
        controlCharacterMap.put(7, "7");
        controlCharacterMap.put(8, "8");
        controlCharacterMap.put(9, "9");
        controlCharacterMap.put(10, "A");
        controlCharacterMap.put(11, "B");
        controlCharacterMap.put(12, "C");
        controlCharacterMap.put(13, "D");
        controlCharacterMap.put(14, "E");
        controlCharacterMap.put(15, "F");
        controlCharacterMap.put(16, "H");
        controlCharacterMap.put(17, "J");
        controlCharacterMap.put(18, "K");
        controlCharacterMap.put(19, "L");
        controlCharacterMap.put(20, "M");
        controlCharacterMap.put(21, "N");
        controlCharacterMap.put(22, "P");
        controlCharacterMap.put(23, "R");
        controlCharacterMap.put(24, "S");
        controlCharacterMap.put(25, "T");
        controlCharacterMap.put(26, "U");
        controlCharacterMap.put(27, "V");
        controlCharacterMap.put(28, "W");
        controlCharacterMap.put(29, "X");
        controlCharacterMap.put(30, "Y");

    }
}
