package z_Test.v1;

public interface IBankAccount {
    void deposit(int amount);// 입금 기능
    boolean withdraw(int amount); // 출금 기능(잔액 부족 시 false 반환)
    int getBalance(); // 현재 잔액 조회 기능
}

