package oop.lab2;

public class TestHuman {
    public static void main(String[] args) {
        Head head = new Head(45.5, true);
        Hand hand1 = new Hand(5, true);
        Hand hand2 = new Hand(6, false);
        Leg leg1 = new Leg(35.5, true);
        Leg leg2 = new Leg(35.6, false);
        Human h1 = new Human("Vasiliy", head, leg1, leg2, hand1, hand2);
        hand1.setNumOfFingers(10);
        System.out.println(h1);
    }
}
