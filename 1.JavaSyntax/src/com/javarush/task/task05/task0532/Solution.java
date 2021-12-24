package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] array;
        int max = -2147483648;
        if(n>0){
            array = new int[n];
            for(int i = 0; i< array.length; i++){
                array[i] = Integer.parseInt(reader.readLine());
            }
            for(int i = 0; i < array.length; i++){
                if(array[i]>max)
                    max = array[i];
            }
        }

        int maximum = max;

        //напишите тут ваш код
        if(n>0)
        System.out.println(maximum);
    }
}
