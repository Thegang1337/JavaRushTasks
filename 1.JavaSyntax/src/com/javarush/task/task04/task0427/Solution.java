package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();

        int a = Integer.parseInt(str);

        if (a >= 1 && a <= 999) {
            if (a % 2 == 0) {
                if (str.length() == 1)
                    System.out.println("четное однозначное число");
                if (str.length() == 2)
                    System.out.println("четное двузначное число");
                if (str.length() == 3)
                    System.out.println("четное трехзначное число");
            } else {
                if (str.length() == 1)
                    System.out.println("нечетное однозначное число");
                if (str.length() == 2)
                    System.out.println("нечетное двузначное число");
                if (str.length() == 3)
                    System.out.println("нечетное трехзначное число");
            }
        }
    }
}
