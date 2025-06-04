package z_Test.v1;

public class Test {
    public static void main(String[] args) {
        IBankAccount bank = new Bank("1234","홍길동");
        bank.deposit(1234);
        bank.withdraw(1234);
        bank.withdraw(1234);
        bank.deposit(1234);
        System.out.println("잔액: " + bank.getBalance() + "원");
    }
}
