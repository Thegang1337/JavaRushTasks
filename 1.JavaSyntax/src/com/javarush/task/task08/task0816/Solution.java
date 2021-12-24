package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JULY 1 2010"));
        map.put("Сидоров", dateFormat.parse("SEPTEMBER 1 2000"));
        map.put("Петров", dateFormat.parse("AUGUST 1 2011"));
        map.put("Ильин", dateFormat.parse("OCTOBER 1 1998"));
        map.put("Журавлев", dateFormat.parse("JUNE 1 2001"));
        map.put("Лохов", dateFormat.parse("OCTOBER 1 2013"));
        map.put("Мохов", dateFormat.parse("APRIL 1 2020"));
        map.put("Приходов", dateFormat.parse("DECEMBER 1 2015"));
        map.put("Герк", dateFormat.parse("MARCH 1 2014"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            if(date.getMonth() > 4 & date.getMonth() < 8)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}
