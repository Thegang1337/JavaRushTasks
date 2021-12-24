package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        for (String s : array) {
            if (isNumber(s))
                integers.add(Integer.parseInt(s));
            else
                strings.add(s);
        }
        Collections.sort(integers);

        String[] tmp1 = new String[strings.size()];
        for (int i = 0; i < tmp1.length; i++)
            tmp1[i] = strings.get(i);

        for (int i = 0; i < tmp1.length; i++)
            for (int j = tmp1.length - 1; j > i; j--)
                if (isGreaterThan(tmp1[j-1], tmp1[j])){
                    String tmp = tmp1[j-1];
                    tmp1[j-1] = tmp1[j];
                    tmp1[j] = tmp;
                }
        for (int i = 0; i < tmp1.length; i++)
            strings.set(i, tmp1[i]);

        String[] array2 = new String[array.length];
        int countN = 0;
        int countS = 0;

        for (int i = 0; i < array.length; i++)
            if (isNumber(array[i])){
                array2[i] = "" + integers.get(integers.size() - 1 -countN);
                countN++;
            } else {
                array2[i] = strings.get(countS);
                countS++;
            }

        for (int i = 0; i < array.length; i++)
            array[i] = array2[i];

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
