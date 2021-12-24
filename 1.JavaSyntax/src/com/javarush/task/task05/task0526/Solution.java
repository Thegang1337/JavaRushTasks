package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("A",10,"B");
        Man man2 = new Man("C", 12, "D");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman woman1 = new Woman("Ir", 222, "port");
        Woman woman2 = new Woman("Ser", 32, "gay");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    //напишите тут ваш код

    public static class Man{
        int age;
        String name;
        String address;
        public Man(String name, int age, String address){
            this.address = address;
            this.age = age;
            this.name = name;
        }
    }

    public static class Woman{
        int age;
        String name;
        String address;
        public Woman(String name, int age, String address){
            this.address = address;
            this.age = age;
            this.name = name;
        }
    }
}
