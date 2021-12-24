package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date newDate = new Date(Date.parse(date));
        SimpleDateFormat day = new SimpleDateFormat("D");
        int res = Integer.parseInt(day.format(newDate));
        return (res - 1) % 2 == 0;
    }
}
