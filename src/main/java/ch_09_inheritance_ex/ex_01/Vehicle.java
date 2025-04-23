package ch_09_inheritance_ex.ex_01;

public class Vehicle {
    public int speed;
    public int heading;

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void turn(int angle){
        heading = angle;
    }


}
