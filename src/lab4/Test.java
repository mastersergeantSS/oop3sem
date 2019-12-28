package oop.lab4;

import javax.naming.Name;

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog(5,"Mark");
        Car c1 = new Car("Blue", "Toyota", 6323.34);
        Nameable nameable = new Car("Red", "Audi", 75414);

        System.out.println(d1.getName());
        System.out.println(c1.getName());
        System.out.println(nameable.getName());
    }
}
