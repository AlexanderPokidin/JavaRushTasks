package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Soyer", "Tom");
        map.put("Hunter", "Jaeremy");
        map.put("Beef", "Susy");
        map.put("Stoltenberg", "Harry");
        map.put("O`brian", "Harry");
        map.put("Stivensson", "Hanna");
        map.put("Loft", "Jaeremy");
        map.put("Oldman", "Tom");
        map.put("Obama", "Barah");
        map.put("Blade", "Susy");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            Iterator secondIt = map.entrySet().iterator();
            while (secondIt.hasNext()){
                Map.Entry<String, String> secondEntry = (Map.Entry<String, String>) secondIt.next();
                if (entry.getValue().equals(secondEntry.getValue()) && !entry.getKey().equals(secondEntry.getKey())){
                    removeItemFromMapByValue(map, entry.getValue());
                    it = map.entrySet().iterator();
                    break;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}