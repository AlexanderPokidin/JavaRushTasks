package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    private static int max(int a, int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = reader.readLine();
        String string2 = reader.readLine();
        String string3 = reader.readLine();
        String string4 = reader.readLine();
        int a = Integer.parseInt(string1);
        int b = Integer.parseInt(string2);
        int c = Integer.parseInt(string3);
        int d = Integer.parseInt(string4);

        if (max(a, b) < max(c, d)){
            System.out.println(max(c, d));
        }else {
            System.out.println(max(a, b));
        }
        //напишите тут ваш код
    }
}
