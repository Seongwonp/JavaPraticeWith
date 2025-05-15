package ch_09.ch_09_inheritance.t_ch_09_inheritance_ex.ex_02;

public class Car {
    public String maker;
    public String model;
    public String color;
    public int curSpeed;
    public Car(String maker, String model, String color, int curSpeed) {
        this.maker = maker;
        this.model = model;
        this.color = color;
        this.curSpeed = curSpeed;
    }

    public String getMaker() { return maker; }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public int getCurSpeed() { return curSpeed; }
    public void speedUp(){ curSpeed++; }
    public void speedDown(){ curSpeed--; }
}
