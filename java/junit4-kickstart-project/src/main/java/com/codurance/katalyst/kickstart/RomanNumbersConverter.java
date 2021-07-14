package com.codurance.katalyst.kickstart;

import java.lang.invoke.SwitchPoint;

public class RomanNumbersConverter {

    public String convert(int number){
        StringBuilder romanNumber = new StringBuilder();

        if (number <= 3) {
            for (int i = 1; i <= number; i++)
                romanNumber.append(basicConversion(1));
            return romanNumber.toString();
        }else if(basicConversion(number) == null){
            for (int i = 1; i <= 7; i++)
                romanNumber.append(basicConversion(1));

            return romanNumber.toString();
        }else{
            return basicConversion(number);
        }
    }

    private String basicConversion(int number){
        switch(number) {
            case 1:
                return "I";
            case 5:
                return "V";
            case 10:
                return "X";
            case 50:
                return "L";
            case 100:
                return "C";
            case 500:
                return "D";
            case 1000:
                return "M";
            default:
                return null;
        }
    }
}
