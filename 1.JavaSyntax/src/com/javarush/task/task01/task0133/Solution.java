package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {

        int nTime = seconds % 3600;
        return nTime;
    }
}