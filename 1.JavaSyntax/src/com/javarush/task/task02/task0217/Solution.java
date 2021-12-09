package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        int m2 = 0;
        if(min(a,b)<=min(c,d)){
            m2 = min(a,b);
        }else {
            m2 = min(c,d);
        }
        return m2;

    }

    public static int min(int a, int b) {
        int m1 = 0;
        if(a<=b)
            m1 = a;
        else
            m1 = b;
        return m1;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
