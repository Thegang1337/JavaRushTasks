package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int a[] = getInts();
        int maximum = a[0];
        int minimum = a[0];

        for (int i = 0; i < a.length; i++){
            if (maximum < a[i])
                maximum = a[i];
            if (minimum > a[i])
                minimum = a[i];
        }

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        for (int i = 0; i < 20; i++)
            a[i] = Integer.parseInt(reader.readLine());
        return a;
    }
}
