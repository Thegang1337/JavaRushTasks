package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nn = reader.readLine();
        int n = Integer.parseInt(nn);
        System.out.println("Я буду зарабатывать $"+n+" в час");
    }
}
