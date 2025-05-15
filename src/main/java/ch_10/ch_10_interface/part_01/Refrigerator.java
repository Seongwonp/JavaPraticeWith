package ch_10.ch_10_interface.part_01;

public class Refrigerator implements RemotControl{

    @Override
    public void turnOn() {
        System.out.println("Refrigerator ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator OFF");
    }
}
