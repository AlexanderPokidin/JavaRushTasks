package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Sergey");
        map.put("Petrov", "Dmitry");
        map.put("Sergeev", "Nikolay");
        map.put("Nikolaev", "Ivan");
        map.put("Tarasov", "Ivan");
        map.put("Pavlenko", "Oleg");
        map.put("Sidorov", "Boris");
        map.put("Zaycev", "Oleg");
        map.put("Markov", "Vasily");
        map.put("Popov", "Dmitry");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;

        for (Map.Entry<String, String> m: map.entrySet()) {
            if (m.getValue().equals(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry m: map.entrySet()) {
            if (m.getKey().equals(lastName)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}