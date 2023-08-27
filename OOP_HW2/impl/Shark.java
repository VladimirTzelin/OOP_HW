package OOP_HW2.impl;


import OOP_HW2.Animal;
import OOP_HW2.Swimmable;

public class Shark extends Animal implements Swimmable {
    public Shark(String name, String color) {
        super(name, color, 0);
    }

    public Shark(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Звуков не издаю, но могу тяпнуть!");
    }

    @Override
    public void hunt() {}

    @Override
    public int getSwimmingSpeed() {
        return 30;
    }
}