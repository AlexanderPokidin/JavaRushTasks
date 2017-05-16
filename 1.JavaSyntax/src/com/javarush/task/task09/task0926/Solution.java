package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        
//        int[]lehght = {5, 2, 4, 7, 0};
//        for (int i = 0; i < lehght.length; i++) {
//            list.add(new int[i]);
//        }

        int[] array1 = {5, 5, 7, 4, 6};
        int[] array2 = {8, 9};
        int[] array3 = {1, 2, 3, 4};
        int[] array4 = {9, 8, 7, 6, 5, 4, 3};
        int[] array5 = {};

        list.add(array1);
        list.add(array2);
        list.add(array3);
        list.add(array4);
        list.add(array5);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}