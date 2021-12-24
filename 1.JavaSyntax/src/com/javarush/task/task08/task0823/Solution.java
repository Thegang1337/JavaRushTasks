package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char[] array = string.toCharArray();
        if (array[0] != ' ') {
            array[0] = Character.toUpperCase(array[0]);
        }

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == ' ') {
                if (Character.isLetter(array[i+1]))
                    array[i+1] = Character.toUpperCase(array[i+1]);
            }
        }
        String str = new String(array);
        System.out.println(str);

    }
}

