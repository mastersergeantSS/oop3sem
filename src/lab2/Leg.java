package oop.lab2;

public class Leg {
    private double length;
    private  boolean isRight;

    public Leg() {
        length = 0;
        isRight = true;
    }
    public  Leg(double length) {
        this.length = length;
    }
    public Leg(boolean right) {
        length = 0;
        isRight = right;
    }
    public Leg(double length, boolean right) {
        this.length = length;
        isRight = right;
    }
    public boolean isRight() {
        return isRight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public String toString() {
        if (isRight == true)
            return "Right leg's length is " + length + " cm";
        else return "Left leg's length is " + length + " cm";
    }
}
