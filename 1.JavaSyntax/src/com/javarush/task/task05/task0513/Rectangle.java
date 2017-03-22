package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public void initialize(Rectangle another){
        this.top = another.top;
        this.left = another.left;
        this.width = another.width;
        this.height = another.width;
    }
    public void initialize(int top, int width, int height){
        this.top = top;
        this.left = top;
        this.width = width;
        this.height = height;
    }
    public void initialize(int width){
        this.top = 0;
        this.left = 0;
        this.width = width;
        this.height = width;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
/*Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(…)

Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)*/