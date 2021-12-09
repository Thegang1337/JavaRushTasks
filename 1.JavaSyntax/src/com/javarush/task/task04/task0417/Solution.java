package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a1 = reader.readLine();
        String a2 = reader.readLine();
        String a3 = reader.readLine();

        int n1 = Integer.parseInt(a1);
        int n2 = Integer.parseInt(a2);
        int n3 = Integer.parseInt(a3);

        if (n1 == n2 && n1 == n3)
            System.out.println(n1 + " " + n2 + " " + n3);
        else
            if(n1==n2)
                System.out.println(n1 + " " + n2);
            else
                if(n1 == n3)
                    System.out.println(n1 + " " + n3);
                else
                    if(n2 == n3)
                        System.out.println(n2 + " " + n3);

    }
}