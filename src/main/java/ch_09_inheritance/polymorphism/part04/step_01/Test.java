package ch_09_inheritance.polymorphism.part04.step_01;

public class Test {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new TV());
        buyer.buy(new Computer());

        System.out.println("현재 남은 돈은 " + buyer.getMoney() + "만원 입니다.");
        System.out.println("현재 포인트는: " + buyer.getBonusPoint() + "접입니다.");
    }
}
