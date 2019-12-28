package oop.lab3;

public class AfghanHound extends Dog {
    public AfghanHound() {
        super();
    }

    public AfghanHound(int age, String name) {
        super(age, name);
    }

    public AfghanHound(int age) {
        super(age);
    }

    public AfghanHound(String name) {
        super(name);
    }

    public void useAbility() {
        System.out.println(this.getName() + " began to actively molt");
    }
}
