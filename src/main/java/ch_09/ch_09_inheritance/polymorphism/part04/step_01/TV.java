package ch_09.ch_09_inheritance.polymorphism.part04.step_01;

public class TV extends Product {

    TV() {
        super(100); // tv가격 100만원

    }

    @Override
    public String toString() {
        return "TV";
    }

}
