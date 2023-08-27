package OOP_HW2.impl;


import OOP_HW2.Animal;
import OOP_HW2.Runnable;

public class Cat extends Animal implements Runnable {
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Мяу!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getRunningSpeed() {
        return 25;
    }
}