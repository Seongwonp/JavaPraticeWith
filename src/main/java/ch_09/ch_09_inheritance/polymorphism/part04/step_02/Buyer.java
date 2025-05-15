package ch_09.ch_09_inheritance.polymorphism.part04.step_02;

public class Buyer {
    private int money = 1000;//소유금액
    private int bonusPoint = 0; //보유 포인트
    private Product[] products = new Product[10];
    private int index = 0; //product 배열에 사용될 카운터

    public void buy(Product product) {
            if(money < product.getPrice()) {
                System.out.println("Low money");
                return;
            }
            money -= product.getPrice();
            bonusPoint += product.getBonusPoint();
            System.out.println(index);
            products[index++] = product;
            System.out.println(product + "을/를 구입하셨습니다.");

    }

    public void summary(){
        int sum=0; //합계
        String itemList = "";//구입한 물품목록
    /*
        //for문
        for(int i=0; i<products.length; i++) {
            if(products[i] == null){
                break;
            }
            sum+=products[i].getPrice();
            itemList += products[i] + ",";
        }
    */

/*
        //for-each문
        for(Product product : products) {
            if(product == null) {
                break;
            }
            sum+=product.getPrice();
            itemList += product + ",";
        }
*/

        //반복 줄이기위해 index 변수 사용
        for(int i=0; i<index; i++) {
            sum+=products[i].getPrice();
            if(i == index-1){
                itemList += products[i];
                break;
            }
            itemList += products[i] + ",";
        }


        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 물품은 " + itemList + " 입니다.");

    }

    public int getMoney() {
        return money;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }

}
