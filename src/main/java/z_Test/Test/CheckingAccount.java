package z_Test.Test;

public class CheckingAccount extends BankAccount {
    private double chargeRate;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double chargeRate) {
        super(accountNumber, accountHolder, balance);
        this.chargeRate = chargeRate;
    }


    @Override
    public boolean withdraw(String accountNumber, double amount) {
        double totalAmount = amount + amount * chargeRate;
        if (totalAmount < 0){
            System.out.println("-에러내용: 금액을 음수로 입력할수 없습니다!");
            return false;
        }
        if (getBalance() < totalAmount) {
            System.out.println("-에러내용: 잔액이 부족합니다!");
            return false;
        }
        setBalance(getBalance() - totalAmount);
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "/ 수수료율: " + chargeRate;
    }
}
