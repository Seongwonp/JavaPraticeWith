package ch_09.ch_09_inheritance.polymorphism.part04.step_04;

public class Audio extends Product {

    public Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}
