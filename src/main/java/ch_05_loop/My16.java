package ch_05_loop;

import java.util.Scanner;

public class My16 {
    public static void main(String[] args) {
        //잔액이 10000원, 사용 금액을 입력받아 잔액이 0이되도록
        Scanner scanner = new Scanner(System.in);
        int money = 10000;
        System.out.println("현재 가진 돈은 " + money + "원입니다.");
        while(true){
            System.out.print("얼마를 사용하시겠습니까? >>> ");
            int spendMoney = scanner.nextInt();
            if(spendMoney > money || spendMoney < 0){
                System.out.println("다시 입력해 주세요(사용범위가 틀렸습니다.)");
                continue;
            }
            money -= spendMoney;
            System.out.println("이제 " + money + "원이 남았습니다.");
            if(money == 0){
                break;
            }
        }
        System.out.println("모든 돈을 사용합니다. 종료");
    }
}
