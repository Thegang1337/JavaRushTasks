package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        String s4 = reader.readLine();

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);
        int n4 = Integer.parseInt(s4);

        int max12 = Math.max(n1,n2);
        int max34 = Math.max(n3,n4);

        System.out.println(Math.max(max12,max34));

    }
}
