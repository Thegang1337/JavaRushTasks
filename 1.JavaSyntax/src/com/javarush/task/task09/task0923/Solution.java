package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        List<Character> vowels = new ArrayList<>();
        List<Character> notVowels = new ArrayList<>();

        char[] a = s.toCharArray();

        for (Character i : a)
            if(isVowel(i))
                vowels.add(i);
            else
                if (i != ' ')
                    notVowels.add(i);

        String s1 = new String();
        String s2 = new String();

        for (Character i : vowels)
            s1 += i + " ";
        for (Character i : notVowels)
            s2 += i + " ";
        System.out.println(s1);
        System.out.println(s2);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}