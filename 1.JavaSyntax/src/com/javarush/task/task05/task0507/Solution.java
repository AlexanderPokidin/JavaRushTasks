package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num = 0;
        int i = 0;
        double sum = 0;


        while (num != -1){
            String str = reader.readLine();

            if (str.equals("-1")){
                System.out.println(sum / i);
                break;
            }

            num = Integer.parseInt(str);
            sum = sum + num;
            i++;
        }
    }
}

