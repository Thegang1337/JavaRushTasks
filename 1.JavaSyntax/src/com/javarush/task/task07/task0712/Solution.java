package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        int x = 500, y = 500;
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int maxLength = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (maxLength < list.get(i).length()) {
                maxLength = list.get(i).length();
            }
        }

        int minLength = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (minLength > list.get(i).length()) {
                minLength = list.get(i).length();
            }
        }

        //int i = 0;
        for (int i = 0; i < list.size(); i++) {
            //while (i<list.size()){
            if (minLength == list.get(i).length()) {
                x = i;
                break;
            }
            if (maxLength == list.get(i).length()) {
                y = i;
                break;
            }

        }
        if (x < y)
            System.out.println(list.get(x));
        else
            System.out.println(list.get(y));

    }
}
