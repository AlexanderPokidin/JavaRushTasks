package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    private int left;
    private int top;
    private int width;
    private int height;

    public Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    public Rectangle(Rectangle another){
        this.left = another.left;
        this.top = another.top;
        this.width = another.width;
        this.height = another.height;
    }

    public static void main(String[] args) {

    }
}
