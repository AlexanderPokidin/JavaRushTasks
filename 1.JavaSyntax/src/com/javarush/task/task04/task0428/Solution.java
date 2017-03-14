package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);
        String c = reader.readLine();
        int c1 = Integer.parseInt(c);

        int count = 0;

        if (a1 > 0){
            count++;
        }if (b1 > 0){
            count++;
        }if (c1 > 0){
            count++;
        }
        System.out.println(count);
        //напишите тут ваш код

    }
}
