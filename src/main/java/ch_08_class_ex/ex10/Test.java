package ch_08_class_ex.ex10;

public class Test {
    public static void main(String[] args) {
        /*
            은행 계좌 객체인 Account 객체는 잔고 (balance) 필드만 가지고 있음.
            balance 필드는 음수값이 될 수 없고, 최대 백만원까지 저장할 수 있음.
            외부에서 balance 필드를 마음대로 변경하지 못하도록 하고,
            0 ~ 1,000,000 범위의 값만 가질 수 있도록 Account 클래스를 작성.

            1) Setter와 Getter를 이용.
            2) 0과 1,000,000은 MIN_BALANCE 와 MAX_BALANCE 상수를 선언해서 이용.
            3) Setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance 값을 유지.
            4) 생성자는 빈 생성자와 int 값을 받는 생성자 2가지.
        */
        Account account = new Account();
        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());  // 10000

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());  // 10000

        account.setBalance(2000000); // 2백만원
        System.out.println("현재 잔고: " + account.getBalance()); // 10000

        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance()); // 300000


        Account account2 = new Account(20000);
        System.out.println("현재 잔고: " + account2.getBalance()); // 20000
    }
}
