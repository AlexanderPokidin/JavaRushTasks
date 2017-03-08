package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = reader.readLine();
        String str2 = reader.readLine();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        if (a < b){
            System.out.println(a);
        }else if (a > b){
            System.out.println(b);
        }else {
            System.out.println(a);
        }
    }
}