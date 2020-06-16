package com.twschool.practice;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculationNumberTest {
    @Test
    public void should_return_array_when_getInputNumberArray_given_string(){
        //given
        String numStr = "1 3 4 5";
        CalculationNumber calculationNumber = new CalculationNumber();

        //when
        int[] num = calculationNumber.getInputNumberArray(numStr);

        //then
        assertThat(num[0], is(1));
        assertThat(num[1], is(3));
        assertThat(num[2], is(4));
        assertThat(num[3], is(5));
    }


}
