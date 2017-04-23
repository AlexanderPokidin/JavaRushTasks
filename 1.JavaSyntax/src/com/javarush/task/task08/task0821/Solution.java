package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Petrov", "Boris");
        map.put("Ivanov", "Denis");
        map.put("Kozlov", "Ivan");
        map.put("Petrov", "Boris");
        map.put("Sokolov", "Boris");
        map.put("Pavlov", "Ivan");
        map.put("Ivanov", "Taras");
        map.put("Ivanov", "Nikita");
        map.put("Borisov", "Taras");
        map.put("Kozlov", "Max");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}