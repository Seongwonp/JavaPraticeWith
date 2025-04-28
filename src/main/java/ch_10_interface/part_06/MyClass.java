package ch_10_interface.part_06;

public class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("MyClass.myMethod");
    }

    @Override
    public void x() {
        System.out.println("MyClass.x");
    }

    @Override
    public void y() {
        System.out.println("MyClass.y");
    }
}
