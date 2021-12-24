package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<>();
        ArrayList<Human> parents = new ArrayList<>();
        ArrayList<Human> parentMom = new ArrayList<>();
        ArrayList<Human> parentDad = new ArrayList<>();
        ArrayList<Human> grandParents = new ArrayList<>();
        ArrayList<Human> empty = new ArrayList<>();

        children.add(new Human("son", true, 15, empty));
        children.add(new Human("daughter", false, 19, empty));
        children.add(new Human("sonS", true, 5, empty));

        Human dad = new Human("dad", true, 40, children);
        Human mom = new Human("mom", false, 40, children);

        parents.add(dad);
        parents.add(mom);
        parentMom.add(mom);
        parentDad.add(dad);

        grandParents.add(new Human("grandfather1", true, 65, parentDad));
        grandParents.add(new Human("grandfather2", true, 66, parentMom));
        grandParents.add(new Human("grandmother1", false, 70, parentDad));
        grandParents.add(new Human("grandmother2", false, 75, parentMom));

        for (int i = 0; i < grandParents.size(); i++)
            System.out.println(grandParents.get(i).toString());
        for (int i = 0; i < parents.size(); i++)
            System.out.println(parents.get(i).toString());
        for (int i = 0; i < children.size(); i++)
            System.out.println(children.get(i).toString());
    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human (String name, boolean sex, int age, ArrayList<Human> children){
            this.age = age;
            this.children = children;
            this.name = name;
            this.sex = sex;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
