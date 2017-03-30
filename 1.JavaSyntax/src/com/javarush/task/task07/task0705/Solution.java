package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] bigArray = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++){
            int num = Integer.parseInt(reader.readLine());
            bigArray[i] = num;
        }
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        for (int i = 0; i < bigArray.length; i++){
            if (i < firstArray.length){
                firstArray[i] = bigArray[i];
            } else {
                secondArray[i - firstArray.length] = bigArray[i];
                System.out.println(secondArray[i - firstArray.length]);
            }
        }
    }
}
