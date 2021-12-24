package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        String[] firstName = {"Витя", "Саша", "Дима", "Александр", "Саша", "Витя", "Дима", "Дима", "Вася", "Леня"};
        String[] lastName = {"Приходько", "Дегтярь", "Тонких", "Бесман", "Коваль", "Гузий", "Макашев", "Иванов", "Петров", "Сидоров"};
        for (int i = 0; i < 10; i++)
            map.put(lastName[i], firstName[i]);
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String key : map.keySet())
            if(map.get(key) == name)
                count++;
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String key : map.keySet())
            if(key == lastName)
                count++;
        return count;
    }

    public static void main(String[] args) {

    }
}
