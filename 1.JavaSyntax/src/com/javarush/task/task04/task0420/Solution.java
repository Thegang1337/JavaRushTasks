package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array;
        array = new int[3];
        for(int i = 0; i< array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = 0; i<array.length-1; i++){
            for (int j = array.length-1; j>i;j--){
                if(array[j-1]<array[j]) {
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }

        for (int i = 0; i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
