package com.javarush.task.task04.task0435;

/*
Четные числа
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        while(i++ < 10)
        {
            int j = 1;
            while(j <= 10)
            {
                System.out.print(i*j++ + " ");
            }
            System.out.println();

        }

    }
}
