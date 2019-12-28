package oop.lab3;

public class Bloodhound extends Dog {
    public Bloodhound() {
        super();
    }

    public Bloodhound(int age, String name) {
        super(age, name);
    }

    public Bloodhound(int age) {
        super(age);
    }

    public Bloodhound(String name) {
        super(name);
    }

    public void useAbility() {
        System.out.println(this.getName() + " howls loudly");
    }
}
