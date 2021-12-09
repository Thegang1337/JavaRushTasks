package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String nn1 = reader.readLine();
        String nn2 = reader.readLine();
        int n1 = Integer.parseInt(nn1);
        int n2 = Integer.parseInt(nn2);
        System.out.println(name + " получает " + n1 + " через " + n2 + " лет.");
    }
}
