package oop.lab2;

public class Human {
    private  Head head;
    private Leg leg1;
    private Leg leg2;
    private Hand hand1;
    private Hand hand2;
    private String name;

    public Human(String n, Head head, Leg leg1, Leg leg2, Hand hand1, Hand hand2) {
        name = n;
        this.head = head;
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hand1 = hand1;
        this.hand2 = hand2;
    }
    public  Human() {
        name = "nameless";
        Head head = new Head();
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        Leg leg1 = new Leg();
        Leg leg2 = new Leg();
        this.head = head;
        this.hand1 = hand1;
        this.hand2 = hand2;
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public Hand getHand1() {
        return hand1;
    }
    public Hand getHand2() {
        return hand2;
    }

    public Leg getLeg1() {
        return leg1;
    }

    public Leg getLeg2() {
        return leg2;
    }

    public Head getHead() {
        return head;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name of human is " + name + "\n" + head + "\n" +
                hand1 + "\n" + hand2 + "\n" + leg1 + "\n" + leg2;
    }
}
