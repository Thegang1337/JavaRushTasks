package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        String[] lastName = {"Приходько", "Дегтярь", "Тонких", "Бесман", "Коваль", "Гузий", "Макашев", "Иванов", "Петров", "Сидоров"};
        int [] salary = {1000, 1, 2, 3, 500, 211, 2323, 900, 100, 200};
        for (int i = 0; i < 10; i++)
            map.put(lastName[i], salary[i]);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            if(iterator.next().getValue() < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}