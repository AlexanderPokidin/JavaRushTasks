package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        int max = 1;
        int count = 1;

        for (int i = 1; i < numbers.size(); i++) {
            int j = i - 1;

            if (numbers.get(i) == numbers.get(j)){
                count++;
                if (count > max){
                    max = count;
                }
            }else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}