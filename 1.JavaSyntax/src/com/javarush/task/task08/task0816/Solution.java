package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date(2011, 5, 12));
        map.put("Arnold", new Date(2011, 2, 25));
        map.put("Harry", new Date(2012, 6, 21));
        map.put("Tommy", new Date(2011, 3, 14));
        map.put("Libovsky", new Date(2010, 8, 2));
        map.put("Jacobs", new Date(2011, 7, 11));
        map.put("Ericsson", new Date(2012, 4, 30));
        map.put("Pokidin", new Date(2011, 11, 5));
        map.put("Ivaniv", new Date(2012, 10, 8));
        map.put("Willis", new Date(2010, 6, 18));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}