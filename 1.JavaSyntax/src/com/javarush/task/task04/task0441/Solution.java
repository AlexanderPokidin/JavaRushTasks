package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strA = reader.readLine();
        int a = Integer.parseInt(strA);
        String strB = reader.readLine();
        int b = Integer.parseInt(strB);
        String strC = reader.readLine();
        int c = Integer.parseInt(strC);

        //version 1
        /*if ((a < b && b < c) || (c < b && b < a)){
            System.out.println(b);
        } else if ((b < c && c < a) || (a < c && c < b)){
            System.out.println(c);
        }else if ((c < a && a < b) || (b < a && a < c)){
            System.out.println(a);
        } else if (a == b && b == c){
            System.out.println(a);
        }*/

        int max = Integer.max(a, Integer.max(b, c));
        int min = Integer.min(a, Integer.min(b, c));
        int mid = (a + b + c) - max - min;
        System.out.println(mid);
    }
}
