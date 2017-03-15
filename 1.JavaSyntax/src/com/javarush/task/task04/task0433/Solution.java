package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 0;

        while (a < 10) {

            System.out.println(sString());
            a++;
        }

    }
    private static String sString(){
        int b = 0;
        while (b < 9){
            System.out.print("S");
            b++;
        }
        return "S";
    }

}
