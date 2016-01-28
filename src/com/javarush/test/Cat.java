package com.javarush.test;

/**
 * Created by user on 28.01.2016.
 */
public class Cat {

    /* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public static void main(String[] args) {
    Cat cat1 = new Cat("tom", 10, 10, 12);
    Cat cat2 = new Cat("jerry", 9, 9, 11);
      boolean res =  cat1.fight(cat2);
        if(res) {
            System.out.println("Победил кот " + cat1.name );
        }else System.out.println("Победил кот " + cat2.name );
    }

    public boolean fight(Cat anotherCat) {
        if (this.strength > anotherCat.strength) {
            return true;
        } else return false;

    }
}

