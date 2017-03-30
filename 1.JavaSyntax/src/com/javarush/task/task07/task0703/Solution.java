package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] stringArray = new String[10];
        int[] numArray = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            String string = reader.readLine();
            stringArray[i] = string;
        }

        for (int i = 0; i < 10; i++){
            numArray[i] = stringArray[i].length();
            System.out.println(numArray[i]);
        }
    }
}
