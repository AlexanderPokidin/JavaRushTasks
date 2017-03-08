package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String year = reader.readLine();
        int numYear = Integer.parseInt(year);
        int x;

        if (numYear % 100 == 0){
            int n = numYear % 400;
                if (n == 0){
                    x = 366;
                }else {
                    x = 365;
                }
        }else{
            int n = numYear % 4;
                if (n == 0){
                    x = 366;
                } else {
                    x = 365;
                }
            }
        System.out.println("количество дней в году: " + x);
    }
}