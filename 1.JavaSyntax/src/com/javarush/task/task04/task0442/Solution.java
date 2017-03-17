package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true){
            String strA = reader.readLine();
            int a = Integer.parseInt(strA);
            sum = sum + a;
            if (strA.equals("-1")){
                System.out.println(sum);
                break;
            }
        }
    }
}
