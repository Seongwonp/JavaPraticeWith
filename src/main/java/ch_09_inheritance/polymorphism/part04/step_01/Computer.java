package ch_09_inheritance.polymorphism.part04.step_01;

public class Computer extends Product {

    public Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}
