package oop.lab3;

public abstract class Dog {
    private int age;
    private String name;

    public Dog() {
        age = 0;
        name = "Dog";
    }
    public Dog(int a) {
        age = a;
        name = "Dog";
    }
    public Dog(String n) {
        age = 0;
        name = n;
    }
    public Dog(int a, String n)
    {
        age = a;
        name = n;
    }

    public void setName(String n) {
        this.name = n;
    }
    public void setAge(int a) {
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return this.name + ", age " + this.age;
    }

    public abstract void useAbility();
}

