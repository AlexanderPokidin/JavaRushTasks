package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        int max = 0;
        int count = 1;

        for (int i = 1; i < numbers.size(); i++) {
            int j = i - 1;

            if (numbers.get(i) == numbers.get(j)){
                count++;
                if (count > max){
                    max = count;
                }
            }else {
                count = 1;
            }
        }
        System.out.println(max);
        //напишите тут ваш код

    }
}
/*1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 9, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.


Требования:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа ArrayList с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.*/