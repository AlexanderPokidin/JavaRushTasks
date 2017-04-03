package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> allList = new ArrayList<>();

        ArrayList<Integer> threeList = new ArrayList<>();
        ArrayList<Integer> twoList = new ArrayList<>();
        ArrayList<Integer> lostList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++){
            allList.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < 20; i++) {
            if (allList.get(i) % 3 == 0){
                threeList.add(allList.get(i));
            }
            if (allList.get(i) % 2 == 0){
                twoList.add(allList.get(i));
            }
            if (allList.get(i) % 2 != 0 && allList.get(i) % 3 != 0){
                lostList.add(allList.get(i));
            }
        }
        printList(threeList);
        printList(twoList);;
        printList(lostList);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код
    }
}
