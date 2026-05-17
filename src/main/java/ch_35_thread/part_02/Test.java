package ch_35_thread.part_02;

// synchronized: 공유 자원에 대한 동시 접근 제어
class BankAccount {
    private int balance;

    BankAccount(int balance) { this.balance = balance; }

    // synchronized 없으면 여러 스레드가 동시에 잔액 변경 → race condition
    public synchronized void deposit(int amount) {
        int current = balance;
        try { Thread.sleep(1); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        balance = current + amount;
        System.out.println(Thread.currentThread().getName() + " 입금 " + amount + " → 잔액: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance < amount) {
            System.out.println(Thread.currentThread().getName() + " 잔액 부족");
            return;
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " 출금 " + amount + " → 잔액: " + balance);
    }

    public int getBalance() { return balance; }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) account.deposit(100);
        }, "입금-스레드");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) account.withdraw(200);
        }, "출금-스레드");

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("최종 잔액: " + account.getBalance());
    }
}
