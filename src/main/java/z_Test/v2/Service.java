package z_Test.v2;

import java.util.*;

public class Service {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("계좌 생성");
        System.out.print("Please input AccountId: ");
        String accountId = scanner.nextLine();
        System.out.print("Please input yourName: ");
        String yourName = scanner.nextLine();
        Account account = new Account(accountId, yourName);
        while(true){
            int choice=0;
            System.out.println("\n=== Banking System ===");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액 조회");
            System.out.println("4. 종료");
            System.out.println("========================");
            System.out.print("Input: ");
            try{
                choice =  Integer.parseInt(scanner.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Invalid input! Please enter a valid number.");
            }

            switch(choice){
                case 1 ->{
                    System.out.println("Input amount");
                    int amount = Integer.parseInt(scanner.nextLine());
                    account.deposit(amount);
                }
                case 2 ->{
                    System.out.print("Input amount: ");
                    int amount = Integer.parseInt(scanner.nextLine());
                    account.withdraw(amount);
                }
                case 3 -> account.printBalance();
                case 4 ->{
                    System.out.println("End of Program...");
                    return;
                }
                default -> System.out.println("Error: Wrong input value! Chose 1-4");
            }
        }

    }
}
