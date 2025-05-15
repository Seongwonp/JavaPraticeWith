package ch_39_design_patton.part_03_factory.part_01;

public abstract class Coffee {
    // 수퍼 클래스. 중요한 뼈대를 결정.
    protected int price;
    public abstract int getPrice(); // 추상 메서드

    @Override
    public String toString() {
        return "Hi this coffee is " + this.getPrice();
    }


}
