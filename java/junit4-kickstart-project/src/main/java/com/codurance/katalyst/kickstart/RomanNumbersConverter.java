package com.codurance.katalyst.kickstart;

import java.lang.invoke.SwitchPoint;
import java.util.HashMap;

public class RomanNumbersConverter {

    HashMap<Integer, String> romanNumbersConversion;

    public RomanNumbersConverter() {
        romanNumbersConversion = new HashMap<Integer, String>();
        romanNumbersConversion.put(1, "I");
        romanNumbersConversion.put(5, "V");
        romanNumbersConversion.put(10, "X");
        romanNumbersConversion.put(50, "L");
        romanNumbersConversion.put(100, "C");
        romanNumbersConversion.put(500, "D");
        romanNumbersConversion.put(1000, "M");
    }

    public String convert(int number){
        StringBuilder romanNumber = new StringBuilder();

        if (number <= 3) {
            for (int i = 1; i <= number; i++)
                romanNumber.append(romanNumbersConversion.get(1));
            return romanNumber.toString();
        }else if(romanNumbersConversion.get(number) == null){
            for (int i = 1; i <= 7; i++){

            }

            return romanNumber.toString();
        }else{
            return romanNumbersConversion.get(number);
        }
    }
}
