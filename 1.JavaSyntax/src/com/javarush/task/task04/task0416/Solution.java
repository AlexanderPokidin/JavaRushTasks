package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public float color(float t){
        if (t >= 0 && t < 3.0){
            System.out.println("зелёный");
        }else if (t >= 3.0 && t < 4.0){
            System.out.println("желтый");
        }else {
            System.out.println("красный");
        }
        return t;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        float t = Float.parseFloat(str);

        Solution solution = new Solution();

        if (t > 5.0) {
            t = t % 5;
            solution.color(t);
        }else {
            solution.color(t);

//            if (t >= 0 && t < 3.0){
//                System.out.println("зелёный");
//            }else if (t >= 3.0 && t < 4.0){
//                System.out.println("желтый");
//            }else {
//                System.out.println("красный");
//            }
//        }else {
//            if (t >= 0 && t < 3.0){
//                System.out.println("зелёный");
//            }else if (t >= 3.0 && t < 4.0){
//                System.out.println("желтый");
//            }else {
//                System.out.println("красный");
//            }
        }

        //напишите тут ваш код
    }
}