package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        if (a>0) {
            a = a * 2;
            System.out.println(a);
        }
        else
            if (a<0) {
                a=a+1;
                System.out.println(a);
            } else
                System.out.println(a);


    }

}