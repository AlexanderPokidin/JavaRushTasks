package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("First", 300);
        map.put("Second", 700);
        map.put("Third", 500);
        map.put("Fourth", 550);
        map.put("Fifth", 650);
        map.put("Sixth", 400);
        map.put("Seventh", 580);
        map.put("Eighth", 600);
        map.put("Ninth", 900);
        map.put("Tenth", 750);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
            if (entry.getValue() < 500){
                it.remove();
            }
        }
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());

    }
}