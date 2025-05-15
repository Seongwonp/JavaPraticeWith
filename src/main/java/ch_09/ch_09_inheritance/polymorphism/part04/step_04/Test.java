package ch_09.ch_09_inheritance.polymorphism.part04.step_04;


public class Test {

    //환풀 기능 추가 , 리스트를 이용한 데이터 저장
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();
        buyer.buy(tv);
        buyer.buy(computer);
        buyer.buy(audio);
        buyer.summary();

        System.out.println("현재 남은 돈은 " + buyer.getMoney() + "만원 입니다.");
        System.out.println("현재 포인트는: " + buyer.getBonusPoint() + "접입니다.");


        //환불
        buyer.refund(tv);
        System.out.println("현재 남은 돈은 " + buyer.getMoney() + "만원 입니다.");
        System.out.println("현재 포인트는: " + buyer.getBonusPoint() + "접입니다.");
    }
}
