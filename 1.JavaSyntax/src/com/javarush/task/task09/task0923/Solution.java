package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        ArrayList vowel = new ArrayList();
        ArrayList consonant = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        for (char c: text.toCharArray()){
            if (isVowel(c)){
                vowel.add(c);
            } else if (c == ' '){

            }else {
                consonant.add(c);
            }
        }
        for (int i = 0; i < vowel.size(); i++) {
            System.out.print(vowel.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < consonant.size(); i++) {
            System.out.print(consonant.get(i) + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}