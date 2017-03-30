package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] numArray = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            int num = Integer.parseInt(reader.readLine());
            numArray[i] = num;
        }
        int[] revers = new int[10];
        for (int i = numArray.length -1; i >= 0; i--){
            System.out.println(numArray[i]);
        }
    }
}

