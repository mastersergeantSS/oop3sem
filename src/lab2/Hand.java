package oop.lab2;

public class Hand {
    private int numOfFingers;
    private boolean isRight;

    public Hand() {
        numOfFingers = 0;
        isRight = true;
    }

    public Hand(int nof) {
        numOfFingers = nof;
        isRight = true;
    }
    public Hand(boolean right) {
        numOfFingers = 0;
        isRight = right;
    }

    public Hand(int nof, boolean right) {
        numOfFingers = nof;
        isRight = right;
    }

    public void setNumOfFingers(int nof) {
        numOfFingers = nof;
    }
    public void setRight(boolean right) {
        isRight = right;
    }

    public int getNumOfFingers() {
        return numOfFingers;
    }
    public boolean isRight() {
        return isRight;
    }

    public String toString() {
        if (isRight == true) {
            return "Right hand have " + numOfFingers + " fingers";
        }
        else return "Left hand have " + numOfFingers + " fingers";
    }
}
