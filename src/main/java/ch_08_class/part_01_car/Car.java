package ch_08_class.part_01_car;

public class Car {
    boolean powerOn;
    String color;
    int wheel;
    int speed;
    boolean wiperOn;

    boolean power() {
        powerOn = !powerOn;
        return powerOn;
    }

    void speedUp() {
        speed++;
    }

    void speedDown() {
        speed--;
    }

    boolean wiper(){
        wiperOn = !wiperOn;
        return wiperOn;
    }


}
