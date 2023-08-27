package OOP_HW2.impl;


import OOP_HW2.Animal;
import OOP_HW2.Flyable;

public class Parrot extends Animal implements Speakable, Flyable {
    public Parrot(String name, String color) {
        super(name, color,2);
    }

    public Parrot(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Я попугай, спроси меня о чём-нибудь!");
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlightSpeed() {
        return 30;
    }
}
