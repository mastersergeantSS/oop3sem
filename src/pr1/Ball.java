package ru.mirea.pr1;

public class Ball {
    private String color;
    private double radius;
    private String owner;

    public Ball(String color, double radius, String owner) {
        this.color = color;
        this.radius = radius;
        this.owner = owner;
    }

    public Ball() {
        color = "none";
        radius = 0;
        owner = "nobody";
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return owner + "'s ball, " + color + ", radius = " + radius;
    }
}
