package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int num = Integer.parseInt(str);

        if (num > 0 && num % 2 == 0 && str.length() == 1){
            System.out.println("четное однозначное число");
        }else if (num > 0 && num % 2 != 0 && str.length() == 1){
            System.out.println("нечетное однозначное число");
        }else if (num > 0 && num % 2 == 0 && str.length() == 2){
            System.out.println("четное двузначное число");
        }else if (num > 0 && num % 2 != 0 && str.length() ==2){
            System.out.println("нечетное двузначное число");
        }else if (num > 0 && num % 2 == 0 && str.length() == 3){
            System.out.println("четное трехзначное число");
        } else if (num > 0 && num % 2 != 0 && str.length() == 3){
            System.out.println("нечетное трехзначное число");
        }
        //напишите тут ваш код

    }
}
