package ch_09_inheritance.polymorphism.part04.step_01;

public class Buyer {
    private int money = 1000;//소유금액
    private int bonusPoint = 0; //보유 포인트

    public void buy(Product product) {
            if(money < product.getPrice()) {
                System.out.println("Low money");
                return;
            }
            money -= product.getPrice();
            bonusPoint += product.getBonusPoint();
            System.out.println(product + "을/를 구입하셨습니다.");

    }

    public int getMoney() {
        return money;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

}
