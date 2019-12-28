package ru.mirea.pr1;

public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball("red", 12, "Petya");
        System.out.println(b2.getColor());
        b2.setColor("grey");
        System.out.println(b1);
        System.out.println(b2);
    }
}
