package com.javarush.task.task03.task0314;

/**
 * Created by asd on 01.03.2017.
 */
public class Solution {
    public static void main(String[] args) {
        int a = 1;
        while(a <= 10){
            int b = 1;
            while(b <= 10){
                System.out.print(a * b + " ");
                b++;
            }
            a++;
            System.out.println("");
        }
    }
}
