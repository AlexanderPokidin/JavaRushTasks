package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    private int max(int a, int b){
        if (a > b){
            return a;
        }else {
            return b;
        }
    }

    private int min(int a, int b){
        if (a < b){
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
        int a = Integer.parseInt(string1);
        int b = Integer.parseInt(string2);
        int c = Integer.parseInt(string3);

        Solution solution = new Solution();

        if (a > solution.max(b, c)){
            System.out.println(a + " " + solution.max(b, c) + " " + solution.min(b, c));
        }else if (b > solution.max(a, c)){
            System.out.println(b + " " + solution.max(a, c) + " " + solution.min(a, c));
        }else if (c > solution.max(a, b)){
            System.out.println(c + " " + solution.max(a, b) + " " + solution.min(a, b));
        }
        //напишите тут ваш код
    }
}
