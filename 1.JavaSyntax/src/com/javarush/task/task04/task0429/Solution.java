package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int numA = Integer.parseInt(a);
        String b = reader.readLine();
        int numB = Integer.parseInt(b);
        String c = reader.readLine();
        int numC = Integer.parseInt(c);

        int posCount = 0;
        int negCount = 0;

        if (numA > 0){
            posCount++;
        }else if (numA < 0){
            negCount++;
        }
        if (numB > 0){
            posCount++;
        }else if (numB < 0){
            negCount++;
        }
        if (numC > 0){
            posCount++;
        }else if (numC < 0){
            negCount++;
        }
        System.out.println("количество отрицательных чисел: " + negCount);
        System.out.println("количество положительных чисел: " + posCount);
    }
}
