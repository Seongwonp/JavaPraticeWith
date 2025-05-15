package ch_09.ch_09_inheritance.polymorphism.part_01;

public class Test01 {
    public static void main(String[] args) {
        FireEngine fireEngine  = new FireEngine();
        fireEngine.drive();
        fireEngine.water();

        Car fireEngine2 = new FireEngine();
        fireEngine2.drive();
//        fireEngine2.water();
        Car car = fireEngine;
        car.drive();
//      car.water()
    }


}
