package ch_10_interface.part_03;


public class Test {
    public static void main(String[] args) {
        MyInterface myInterface = new ImplClass();
        myInterface.method_01();
        myInterface.method_02();
    }
}
