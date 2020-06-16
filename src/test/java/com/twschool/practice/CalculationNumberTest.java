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

    @Test
    public void should_return_0A0B_when_getPromptByCalculation_answer_is_1234_and_input_is_5678(){
        //given
        int[] answer= new int[4];
        answer[0] = 1;
        answer[1] = 2;
        answer[2] = 3;
        answer[3] = 4;
        int[] input= new int[4];
        input[0] = 5;
        input[1] = 6;
        input[2] = 7;
        input[3] = 8;
        CalculationNumber calculationNumber = new CalculationNumber();
        calculationNumber.setAnswerNumber(answer);

        //when
        String output = calculationNumber.getPromptByCalculation(input);

        //then
        assertThat(output, is("0A0B"));
    }

    @Test
    public void should_return_4A0B_when_getPromptByCalculation_answer_is_1234_and_input_is_1234(){
        //given
        int[] answer= new int[4];
        answer[0] = 1;
        answer[1] = 2;
        answer[2] = 3;
        answer[3] = 4;
        int[] input= new int[4];
        input[0] = 1;
        input[1] = 2;
        input[2] = 3;
        input[3] = 4;
        CalculationNumber calculationNumber = new CalculationNumber();
        calculationNumber.setAnswerNumber(answer);

        //when
        String output = calculationNumber.getPromptByCalculation(input);

        //then
        assertThat(output, is("4A0B"));
    }

    @Test
    public void should_return_4A0B_when_getPromptByCalculation_answer_is_1234_and_input_is_1234(){
        //given
        int[] answer= new int[4];
        answer[0] = 1;
        answer[1] = 2;
        answer[2] = 3;
        answer[3] = 4;
        int[] input= new int[4];
        input[0] = 1;
        input[1] = 2;
        input[2] = 3;
        input[3] = 4;
        CalculationNumber calculationNumber = new CalculationNumber();
        calculationNumber.setAnswerNumber(answer);

        //when
        String output = calculationNumber.getPromptByCalculation(input);

        //then
        assertThat(output, is("4A0B"));
    }
}
