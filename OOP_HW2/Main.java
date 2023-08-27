package OOP_HW2;

import java.util.ArrayList;
import java.util.List;

import OOP_HW2.impl.*;
import OOP_HW2.veterinary.VetClinic;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();

        vetClinic
                .addAnimal(new Cat("Джина"))
                .addAnimal(new Dog("Липа"))
                .addAnimal(new Duck("Мак`Дак"))
                .addAnimal(new Bird("Пыжик"))
                .addAnimal(new Parrot("Иннокентий второй"))
                .addAnimal(new Fish("Карпыч"))
                .addAnimal(new Shark("Жуть"));
  
        Doctor beloved = new Doctor("Айболитов Василий Андреевич");
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(beloved);
     

        System.out.println("Все животные:");
        for (Animal a: vetClinic.getAllAnimals()) {
            System.out.println(a);
            a.speak();
        }

        System.out.println("\nБегающие животные:");
        for (Runnable r: vetClinic.getRunningAnimals()) {
            System.out.println(r + ", " + "Скорость: " + r.getRunningSpeed());
        }

        System.out.println("\nПлавающие животные:");
        for (Swimmable s: vetClinic.getSwimmingAnimals()) {
            System.out.println(s + ", " + "Скорость: " + s.getSwimmingSpeed());
        }

        System.out.println("\nЛетающие животные:");
        for (Flyable f: vetClinic.getFlyingAnimals()) {
            System.out.println(f + ", " + "Скорость: " + f.getFlightSpeed());
        }

        System.out.println("\nГоворящие животные:");
        for (OOP_HW2.impl.Speakable sp: vetClinic.getSpeakingAnimals()) {
            System.out.println(sp);
            sp.speak();
        }

        System.out.println("\nГлавный ветеринарный врач:");
        System.out.println(doctors);
    
    }

}