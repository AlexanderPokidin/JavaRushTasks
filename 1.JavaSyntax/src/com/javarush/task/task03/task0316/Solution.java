package com.javarush.task.task03.task0316;

/* 
Экранирование символов
*/

public class Solution {
    public static void main(String[] args) {
        String a = "\"";
        String b = "\\";
        System.out.println("It's Windows path: " + a + "C:" + b + "Program Files" + b + "Java" + b + "jdk1.7.0" + b + "bin" + a);
        System.out.println("It's Java string: " + b + a + "C:" + b + b + "Program Files" + b + b + "Java" + b + b + "jdk1.7.0" + b + b + "bin" + b + a);
    }
}
