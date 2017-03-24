package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Boris", 25, "First av.");
        Man man2 = new Man("Taras", 34, "Second sv.");

        Woman woman1 = new Woman("Inna", 25, "Thirt av.");
        Woman woman2 = new Woman("Ira", 29, "Forth av.");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

//        System.out.println(man1);
//        System.out.println(man2);
//        System.out.println(woman1);
//        System.out.println(woman2);
        //напишите тут ваш код
    }

    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

//        @Override
//        public String toString() {
//            return name + " " + age + " " + address;
//        }
    }
    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

//        @Override
//        public String toString() {
//            return  name + " " + age + " " + address;
//        }
    }
}
