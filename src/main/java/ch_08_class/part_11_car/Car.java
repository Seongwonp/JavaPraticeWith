package ch_08_class.part_11_car;

public class Car {
    boolean powerOn;
    static String color;
    static int wheel = 4;
    int speed;
    static boolean wiperOn;

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
