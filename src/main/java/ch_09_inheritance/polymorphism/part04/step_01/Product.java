package ch_09_inheritance.polymorphism.part04.step_01;

public class Product {
    private int price; //가격
    private int bonusPoint; //보너스 포인트

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price/10.0); // 제품가격의 10%
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

}
