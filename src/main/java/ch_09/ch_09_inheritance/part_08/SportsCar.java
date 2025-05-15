package ch_09.ch_09_inheritance.part_08;

public class SportsCar extends Car{
    public int speedLimit;
    public SportsCar(String color, int speedLimit){
        super(color);
        this.speedLimit = speedLimit;

    }
}
