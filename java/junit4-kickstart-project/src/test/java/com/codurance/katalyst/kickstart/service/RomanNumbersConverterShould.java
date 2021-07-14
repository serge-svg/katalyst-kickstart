package com.codurance.katalyst.kickstart.service;

import com.codurance.katalyst.kickstart.RomanNumbersConverter;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumbersConverterShould {

    @Test
    public void convert_1_to_I(){
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();

        assertThat(romanNumbersConverter.convert(1)).isEqualTo("I");
    }

    @Test
    public void convert_5_to_V(){
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();

        assertThat(romanNumbersConverter.convert(5)).isEqualTo("V");
    }

    @Test
    public void convert_10_to_X(){
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();

        assertThat(romanNumbersConverter.convert(10)).isEqualTo("X");
    }

    @Test
    public void convert_50_to_L(){
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();

        assertThat(romanNumbersConverter.convert(50)).isEqualTo("L");
    }

    @Test
    public void convert_100_to_C(){
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();

        assertThat(romanNumbersConverter.convert(100)).isEqualTo("C");
    }

    @Test
    public void convert_500_to_D(){
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();

        assertThat(romanNumbersConverter.convert(500)).isEqualTo("D");
    }

    @Test
    public void convert_1000_to_M(){
        RomanNumbersConverter romanNumbersConverter = new RomanNumbersConverter();

        assertThat(romanNumbersConverter.convert(1000)).isEqualTo("M");
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
