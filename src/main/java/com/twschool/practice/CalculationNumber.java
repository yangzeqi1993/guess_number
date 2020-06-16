package com.twschool.practice;

public class CalculationNumber {

    private int[] answerNumber;

    public boolean isInt(String num){
        return true;
    }

    public int[] getInputNumberArray(String inputNumber){
        String[] numberString = inputNumber.split(" ");
        int[] number = new int[numberString.length];
        for(int i=0;i<numberString.length;i++){
            number[i] = Integer.parseInt(numberString[i]);
        }
        return number;
    }



}
