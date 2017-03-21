package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        return this.age + this.weight + this.strength > anotherCat.age + anotherCat.weight + anotherCat.strength;

//        double x = this.strength * this.weight / this.age;
//        double y = anotherCat.strength * anotherCat.weight / anotherCat.age;
//        return x > y;


//        if ((this.weight * this.strength / this.age) > (anotherCat.weight * anotherCat.strength / anotherCat.age)){
//            return true;
//        } else{
//            return false;
//        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Boris";
        cat1.age = 5;
        cat1.weight = 4;
        cat1.strength = 9;

        Cat cat2 = new Cat();
        cat2.name = "Vasily";
        cat2.age = 7;
        cat2.weight = 6;
        cat2.strength = 8;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
