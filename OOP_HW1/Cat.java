package HW1;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("meow meow!");
    }

    @Override
    public void swim() {}

    @Override
    public void toGo() {}
}
