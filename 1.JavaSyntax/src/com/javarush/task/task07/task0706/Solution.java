package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] street = new int[15];
        int even = 0;
        int odd = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < street.length; i++){
            int num = Integer.parseInt(reader.readLine());
            street[i] = num;
        }
        for (int i = 0; i < street.length; i++){
            if (i % 2 != 0){
                odd = odd + street[i];
            } else {
                even = even + street[i];
        }

        }
        if (even > odd){
            System.out.printf("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.printf("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
