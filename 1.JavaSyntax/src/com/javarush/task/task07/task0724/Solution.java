package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFather1 = new Human("Вася", true, 66);
        Human grandFather2 = new Human("Petya", true, 70);
        Human grandMother1 = new Human("Lida", false, 65);
        Human grandMother2 = new Human("Luba", false, 69);
        Human father = new Human("Dima", true, 40, grandFather1, grandMother1);
        Human mother = new Human("Valya", false, 39, grandFather2, grandMother2);
        Human child1 = new Human("Mira", false, 18, father, mother);
        Human child2 = new Human("Vitya", true, 15, father, mother);
        Human child3 = new Human("Sasha", false, 7, father, mother);
        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        public String name;
        public boolean sex = true;
        public int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}