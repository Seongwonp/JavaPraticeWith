package ch_09_inheritance.polymorphism.part04.step_04;

import java.util.ArrayList;

public class Buyer {
    private int money = 1000;//소유금액
    private int bonusPoint = 0; //보유 포인트
    private ArrayList<Product> products = new ArrayList<>();

    public void buy(Product product) {
            if(money < product.getPrice()) {
                System.out.println("Low money");
                return;
            }
            money -= product.getPrice();
            bonusPoint += product.getBonusPoint();
            products.add(product);
            System.out.println(product + "을/를 구입하셨습니다.");

    }

    public void summary(){
        int sum=0; //합계
        String itemList = "";//구입한 물품목록
        if(products.isEmpty()){
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }
        //for문
        int size = products.size();
        for(int i=0; i<size; i++) {
            Product product = products.get(i);
            sum+=product.getPrice();
            itemList += (i == size -1) ? product : product + ",";
        }



        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 물품은 " + itemList + " 입니다.");

    }

    //환불 기능 추가
    public void refund(Product product) {
        if(products.remove(product)) {
            money += product.getPrice();
            bonusPoint -= product.getBonusPoint();
            System.out.println(product + "을/를 반품하셨습니다.");
        }  else{
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }

    }

    public int getMoney() {
        return money;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }

}
