package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int numA = Integer.parseInt(a);
        if (numA > 0){
            System.out.println(numA *= 2);
        } else if (numA < 0){
            System.out.println(numA += 1);
        } else {
            System.out.println(0);
        }
    }

}