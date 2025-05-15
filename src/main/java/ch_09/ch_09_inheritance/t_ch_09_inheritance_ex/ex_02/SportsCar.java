package ch_09.ch_09_inheritance.t_ch_09_inheritance_ex.ex_02;

public class SportsCar extends Car {
    public SportsCar(String maker, String model, String color, int curSpeed) {
        super(maker, model, color, curSpeed);
    }

    @Override
    public void speedUp() { curSpeed+=10; }

    @Override
    public void speedDown() { curSpeed-=10; }
}
