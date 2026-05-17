package ch_35_thread.part_01;

// Thread 생성 방법: 1) Thread 상속  2) Runnable 구현  3) 람다
class MyThread extends Thread {
    private String name;
    MyThread(String name) { this.name = name; }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("[" + name + "] " + i + "번째 실행");
            try { Thread.sleep(200); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        /*
            스레드(Thread): 프로세스 내에서 독립적으로 실행되는 작업 단위
            - 여러 스레드가 동시에 실행되어 CPU를 효율적으로 사용
            - 실행 순서는 JVM 스케줄러가 결정 (비결정적)
         */

        // 1. Thread 상속
        MyThread t1 = new MyThread("Thread-A");

        // 2. Runnable 구현 (익명 클래스)
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("[Thread-B] Runnable 방식");
            }
        });

        // 3. 람다 (가장 간결)
        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("[Thread-C] " + i + "번째 실행");
                try { Thread.sleep(100); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        });

        t1.start(); // start()로 실행 (run() 직접 호출 X → 단순 메서드 호출이 됨)
        t2.start();
        t3.start();

        // join: 스레드 종료까지 대기
        t1.join();
        t3.join();
        System.out.println("[Main] 모든 스레드 완료");
    }
}
