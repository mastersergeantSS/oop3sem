package oop.lab3;

public class Afador extends Dog {
    public Afador() {
        super();
    }

    public Afador(int age, String name) {
        super(age, name);
    }

    public Afador(int age) {
        super(age);
    }

    public Afador(String name) {
        super(name);
    }

    public void useAbility() {
        System.out.println(this.getName() + " became affectionate with Family");
    }

    @Override
    public String toString() {
        return "Afador" + getName();
    }
}
