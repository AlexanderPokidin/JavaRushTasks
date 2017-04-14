package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(12);
        numbers.add(15);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        numbers.add(22);
        numbers.add(5);
        numbers.add(59);
        numbers.add(64);
        numbers.add(21);
        numbers.add(1);
        numbers.add(6);
        numbers.add(48);
        numbers.add(27);
        numbers.add(31);
        numbers.add(33);

        return numbers;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()){
                    if (iterator.next() > 10){
                        iterator.remove();
                    }
                }
        return set;
    }

    public static void main(String[] args) {

    }
}