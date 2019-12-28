package ru.mirea.pr1;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog(5);
        Dog d3 = new Dog(6, "Jimmy");
        d3.setAge(12);
        System.out.println(d1.toString() + "\n" + d2.toString() + "\n" + d3.toString());
    }
}