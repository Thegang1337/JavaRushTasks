package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(11,13.1));
        System.out.println(convertEurToUsd(122,0.11));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double dollar = eur * exchangeRate;
        return dollar;
    }
}
