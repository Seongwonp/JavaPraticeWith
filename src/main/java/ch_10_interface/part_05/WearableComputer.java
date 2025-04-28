package ch_10_interface.part_05;

public class WearableComputer implements Wearable {
    private String name;
    public WearableComputer(String name) {
        this.name = name;
    }
    @Override
    public void putOff() {
        System.out.println(name + " puts off");
    }

    @Override
    public void putOn() {
        System.out.println(name + " puts on");
    }
}
