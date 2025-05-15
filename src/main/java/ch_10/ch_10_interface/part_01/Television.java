package ch_10.ch_10_interface.part_01;

public class Television implements RemotControl{
    boolean on;
    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV on");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV off");
    }
}
