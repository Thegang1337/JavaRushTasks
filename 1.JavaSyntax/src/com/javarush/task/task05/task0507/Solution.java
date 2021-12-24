package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        int a = 0;
        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number==-1)
                break;
            sum = sum + number;
            a++;
        }
        System.out.println(sum/a);
    }
}

