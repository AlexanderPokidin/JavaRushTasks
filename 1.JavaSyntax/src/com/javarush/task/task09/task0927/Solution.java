package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> catHashMap = new HashMap<>();
        catHashMap.put("Tom", new Cat("Tom"));
        catHashMap.put("Bars", new Cat("Bars"));
        catHashMap.put("Lion", new Cat("Lion"));
        catHashMap.put("Jerry", new Cat("Jerry"));
        catHashMap.put("Frank", new Cat("Frank"));
        catHashMap.put("Hunter", new Cat("Hunter"));
        catHashMap.put("Arny", new Cat("Arny"));
        catHashMap.put("Boris", new Cat("Boris"));
        catHashMap.put("Albert", new Cat("Albert"));
        catHashMap.put("Sam", new Cat("Sam"));

        return catHashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();
        cats.addAll(map.values());
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}