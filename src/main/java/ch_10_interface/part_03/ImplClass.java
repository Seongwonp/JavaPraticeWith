package ch_10_interface.part_03;

public class ImplClass implements MyInterface {

    @Override
    public void method_01() {
        System.out.println("method_01 Override!");
    }

    @Override
    public void method_02() {
        System.out.println("method_02 Override!");

    }
}
