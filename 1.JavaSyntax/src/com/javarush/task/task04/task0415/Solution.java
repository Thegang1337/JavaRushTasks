package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aa = reader.readLine();
        String bb = reader.readLine();
        String cc = reader.readLine();
        int a = Integer.parseInt(aa);
        int b = Integer.parseInt(bb);
        int c = Integer.parseInt(cc);
        if((a+b)>c && (a+c)>b && (b+c)>a)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");

    }
}