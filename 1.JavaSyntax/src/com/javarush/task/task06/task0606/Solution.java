package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/



public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        int number = Integer.parseInt(text);
        int x = text.length();
        int pow = (Pow(10, x))/10;
        int per = pow * 10;

        for (int i=0; i<x; i++){
            int m = number % per;
            if ((m/pow)%2==0)
                even++;
            else
                odd++;
            per = pow;
            pow = pow/10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }

    public static int Pow(int a, int b){
        int x = 1;
        for (int i=0; i<b; i++){
            x = x*a;
        }
        return x;
    }
}