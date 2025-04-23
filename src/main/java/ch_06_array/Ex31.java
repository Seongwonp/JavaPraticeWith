package ch_06_array;

import java.util.Random;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        /*

    간단한 가위바위보 게임 프로그램을 작성하라.
    1) 가위, 바위, 보는 각각 정수형 1, 2, 3으로 간주한다.
    2) 컴퓨터가 제시할 가위바위보 데이터를 만든다.
    다섯개의 정수를 저장할 수 있는 배열을 만들고 1, 2, 3 데이터를 섞어 초기화 한다.
    3) 게임은 총 5회 진행하며, 컴퓨터는 배열 안 데이터를 차례대로 출력하는 것으로 한다.
    4) 현재 횟수 / 총 횟수와 함께 입력 메시지를 출력한다.
    5) 키보드로 1, 2, 3 중 하나를 입력하고, 컴퓨터와 키보드로 입력한 값을 비교하여 누가 이겼는지 알려준다.
    6) 비긴 경우에는 횟수에 포함하지 않는다.
    7) 게임을 종료하면 누가 이겼는지 표시한다.

    1 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.1
    가위입력하셨고, 컴은 가위입니다.비겼습니다.
    1 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.1
    가위입력하셨고, 컴은 가위입니다.비겼습니다.
    1 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.1
    가위입력하셨고, 컴은 가위입니다.비겼습니다.
    1 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.2
    바위입력하셨고, 컴은 가위입니다.사용자가 이겼습니다.
    2 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.3
    보입력하셨고, 컴은 바위입니다.사용자가 이겼습니다.
    3 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.1
    가위입력하셨고, 컴은 가위입니다.비겼습니다.
    3 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.2
    바위입력하셨고, 컴은 가위입니다.사용자가 이겼습니다.
    4 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.3
    보입력하셨고, 컴은 가위입니다.컴이 이겼습니다.
    5 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.2
    바위입력하셨고, 컴은 바위입니다.비겼습니다.
    5 / 5 입니다. 가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.1
    가위입력하셨고, 컴은 바위입니다.컴이 이겼습니다.
    게임 결과는 사용자가 이김
         */
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int count =0;
        int[] Com_rockScissorsPaper = new int[5];
        for(int i = 0; i < Com_rockScissorsPaper.length; i++){
            Com_rockScissorsPaper[i] = rand.nextInt(3)+1;
        }
        for(int i = 0; i < 5; i++){
            System.out.print("가위(1), 바위(2), 보(3)중 하나를 입력해 주십시요.");
            int input = scanner.nextInt();
            int computer = Com_rockScissorsPaper[rand.nextInt(Com_rockScissorsPaper.length)];
            if(input == 1){
                    switch(computer){
                        case 1:
                            System.out.print(count + "/ 5 ");
                            System.out.println("컴은 가위입니다.비겼습니다.");
                            i--;
                            break;
                        case 2:
                            System.out.print(count + "/ 5 ");
                            System.out.println("컴은 바위입니다.졌습니다.");
                            break;
                        case 3:
                            count++;
                            System.out.print(count + "/ 5 ");
                            System.out.println("컴은 보입니다. 이겼습니다.");
                            break;
                    }
            }
            else if(input == 2){
                switch(computer){
                    case 1:
                        count++;
                        System.out.print(count + "/ 5 ");
                        System.out.println("컴은 가위입니다.이겼습니다.");
                        break;
                    case 2:
                        System.out.print(count + "/ 5 ");
                        System.out.println("컴은 바위입니다.비겼습니다.");
                        i--;
                        break;
                    case 3:
                        System.out.print(count + "/ 5 ");
                        System.out.println("컴은 보입니다. 졌습니다.");
            }
        }
            else if(input == 3){
                switch(computer){
                    case 1:
                        System.out.print(count + "/ 5 ");
                        System.out.println("컴은 가위입니다.졌습니다.");
                        break;
                    case 2:
                        count++;
                        System.out.print(count + "/ 5 ");
                        System.out.println("컴은 바위입니다.이겼습니다.");
                        break;
                    case 3:
                        System.out.print(count + "/ 5 ");
                        System.out.println("컴은 보입니다. 비겼습니다.");
                        i--;
                        break;
                }
            }
            else{
                System.out.println("Error 다시 입력하세요.");
                i--;
            }
        }
        if(count == 5){
                System.out.println("사용자가 이겼습니다. 축하합니다.");
        } else{
            System.out.println("컴퓨터가 이겼습니다. 다음기회에...");
        }
        scanner.close();


    }
}
