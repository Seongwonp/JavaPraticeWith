package ch_08_class_ex.ex10;

public class Account {
    private int balance;
    final int MIN_BALANCE = 0;
    final int MAX_BALANCE = 100_0000;

    public Account() {}

    public Account(int balance){
        if(balance >= MIN_BALANCE && balance <= MAX_BALANCE){
            this.balance = balance;

        }
    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        if (amount>= MIN_BALANCE && amount <= MAX_BALANCE) {
            this.balance += amount;
        }
    }
}
