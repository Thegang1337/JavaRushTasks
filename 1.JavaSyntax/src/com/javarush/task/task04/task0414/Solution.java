package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int year = Integer.parseInt(sYear);
        if((year%400)==0 || (year % 100 != 0) && (year % 4 == 0))
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");
    }
}