package ch_10.ch_10_interface.part_01;

public class Test {
    public static void main(String[] args) {
        Television television = new Television();
        television.turnOn();
        television.turnOff();

        Refrigerator refrigerator = new Refrigerator();
        refrigerator.turnOn();
        refrigerator.turnOff();
    }
}
