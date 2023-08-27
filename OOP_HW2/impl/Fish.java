package OOP_HW2.impl;


import OOP_HW2.Animal;
import OOP_HW2.Swimmable;

public class Fish extends Animal implements Swimmable {
    public Fish(String name, String color) {
        super(name, color,0);
    }

    public Fish(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Я всегда молчу!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getSwimmingSpeed() {
        return 40;
    }
}