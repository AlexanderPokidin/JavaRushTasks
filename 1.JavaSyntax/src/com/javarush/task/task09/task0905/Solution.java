package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        int count = 0;
        for (StackTraceElement e: elements) {
            count++;
        }
        System.out.println(count);
        return count;
    }
}