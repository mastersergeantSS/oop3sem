package oop.lab4;

public class Car implements Nameable {
    private String color;
    private String name;
    private double mileage;

    public Car() {
        color = "none";
        name = "nameless";
        mileage = 0;
    }

    public Car(String color, String name, double mileage) {
        this.color = color;
        this.name = name;
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getName() {
        return this.name;
    }
}
