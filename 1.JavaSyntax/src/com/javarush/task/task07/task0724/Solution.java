package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;
import java.util.Collection;

public class Solution {
    public static void main(String[] args) {

        Human human1 = new Human("Tommy", true, 55);
        Human human2 = new Human("John", true, 62);
        Human human3 = new Human("Marru", false, 53);
        Human human4 = new Human("Helen", false, 60);
        Human human5 = new Human("Ray", true, 33, human1, human3);
        Human human6 = new Human("Janet", false, 29, human2, human4);
        Human human7 = new Human("Ann", false, 7, human5, human6);
        Human human8 = new Human("Arny", true, 4, human5, human6);
        Human human9 = new Human("Henry", true, 1, human5, human6);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + name + ", ";
            text += "пол: " + (sex ? "мужской" : "женский") + ", ";
            text += "возраст: " + age + ", ";
            if (father != null){
                text += "отец: " + father.name + ", ";
            }
            if (mother != null){
                text += "мать: " + mother.name;
            }
            return text;
        }
    }
}








