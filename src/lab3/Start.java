package oop.lab3;

public class Start {
    public static void main(String[] args) {
        Dog d1 = new Afador(4, "Charlie");
        AfghanHound d2 = new AfghanHound(12, "Max");
        Bloodhound d3 = new Bloodhound(7, "Oscar");

        System.out.println(d1.toString());
        d3.useAbility();
        d1.useAbility();
        d2.useAbility();

    }
}
