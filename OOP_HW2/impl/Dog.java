package OOP_HW2.impl;

import OOP_HW2.Animal;
import OOP_HW2.Swimmable;
import OOP_HW2.Runnable;

public class Dog extends Animal implements Runnable, Swimmable {
    public Dog(String name, String color) {
        super(name, color,4);
    }

    public Dog(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Ррр_Гав!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getSwimmingSpeed() {
        return 6;
    }

    @Override
    public int getRunningSpeed() {
        return 30;
    }
}