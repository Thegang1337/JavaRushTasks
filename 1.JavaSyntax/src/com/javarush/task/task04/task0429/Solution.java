package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.BufferOverflowException;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array;
        array = new int[3];
        int p = 0;
        int m = 0;
        for (int i = 0; i<array.length;i++){
            array[i] = Integer.parseInt(reader.readLine());
            if(array[i]!=0)
                if(array[i]>0)
                    p++;
                else
                    m++;
        }
        System.out.println("количество отрицательных чисел: " + m);
        System.out.println("количество положительных чисел: " + p);
    }
}
