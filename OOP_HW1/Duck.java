package HW1;

public class Duck extends Animal {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("crack crack!");
    }
    @Override
    public void toGo() {}
    
    @Override
    public void swim() {}
    
    @Override
    public void fly() {}

    
}
