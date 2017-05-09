package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        try {
            readData();
        }
        catch (IOException e){
        }
    }

    public static void readData() throws IOException{
        ArrayList<Integer> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true){
                array.add(Integer.parseInt(reader.readLine()));
            }
        }
        catch (NumberFormatException e){
            for (int n: array) {
                System.out.println(n);
            }
        }
    }
}