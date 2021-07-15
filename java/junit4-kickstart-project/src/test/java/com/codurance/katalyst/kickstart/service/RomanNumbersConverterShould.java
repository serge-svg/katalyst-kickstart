package com.codurance.katalyst.kickstart.service;

import com.codurance.katalyst.kickstart.RomanNumbersConverter;
import junitparams.Parameters;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumbersConverterShould {

    @Test
    @Parameters({
            "1, I",
            "5, V",
            "10, X",
            "50, L",
            "100, C",
            "500, D",
            "1000, M"
    })
    public void convert_arabicNumbers_to_romanNumbers(int arabicNumber, String romanNumber){
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();

        assertThat(romanNumbersConverter.convert(arabicNumber)).isEqualTo(romanNumber);
    }

    @Test
    public void convert_I_units_up_to_three_to_letters(){
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();

        assertThat(romanNumbersConverter.convert(2)).isEqualTo("II");
        assertThat(romanNumbersConverter.convert(3)).isEqualTo("III");
    }

    @Test
    public void convert_V_minus_I_to_IV(){
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();

        assertThat(romanNumbersConverter.convert(4)).isEqualTo("IV");
    }

    @Test
    public void convert_X_minus_I_to_IX(){
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();

        assertThat(romanNumbersConverter.convert(9)).isEqualTo("IX");
    }


}
