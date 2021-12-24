package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        /*Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            while (iterator.hasNext()){
                Map.Entry<String, String> pair2 = iterator.next();
                if (pair.getValue().equals(pair2.getValue()))
                    removeItemFromMapByValue(map, pair2.getValue());
            }

        }*/
        int i = -1;
        int j = -1;

        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            i++;
            for (Map.Entry<String, String> pair2 : copy.entrySet()) {
                j++;
                if (pair.getValue().equals(pair2.getValue()) && i != j) {
                    removeItemFromMapByValue(map, pair2.getValue());
                }
            }
            j=-1;

        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
