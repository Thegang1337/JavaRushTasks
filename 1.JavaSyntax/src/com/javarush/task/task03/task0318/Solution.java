package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String age = reader.readLine();
        String name = reader.readLine();
        int a = Integer.parseInt(age);
        System.out.println(name + " захватит мир через " + a + " лет. Му-ха-ха!");

    }
}
