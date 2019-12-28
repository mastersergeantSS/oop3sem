package oop.lab2;

public class Head {
    private double volume;
    private boolean isBald;

    public Head() {
        volume = 50;
        isBald = false;
    }
    public Head(double volume) {
        this.volume = volume;
        isBald = false;
    }
    public Head(boolean bald) {
        isBald = bald;
        volume = 50;
    }
    public Head(double volume, boolean bald) {
        isBald = bald;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public boolean isBald() {
        return isBald;
    }

    public void setVolume(double v) {
        volume = v;
    }
    public void setBald(boolean bald) {
        isBald = bald;
    }

    public String toString() {
        if (isBald == true) {
            return "Volume of bald head is " + volume;
        }
        else return "Volume of hairy head is " + volume;
    }
}
