package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        double t = Double.parseDouble(s);

        if(t%5>=0 && t%5<3)
            System.out.println("зеленый");
        if(t%5>=3 && t%5<4)
            System.out.println("желтый");
        if(t%5>=4 && t%5<5)
            System.out.println("красный");

    }
}