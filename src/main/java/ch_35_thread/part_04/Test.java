package ch_35_thread.part_04;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    /*
        volatile: 변수를 메인 메모리에서 직접 읽고 씀 (CPU 캐시 무효화)
        - 가시성 보장, 원자성은 보장 안 함 (단순 read/write에만 사용)

        AtomicInteger: CAS(Compare-And-Swap) 기반 원자적 연산
        - synchronized 없이 스레드 안전한 카운터/플래그에 사용
     */

    private static volatile boolean running = true;           // 종료 신호용
    private static AtomicInteger atomicCounter = new AtomicInteger(0);
    private static int unsafeCounter = 0; // 비교용 (스레드 안전하지 않음)

    public static void main(String[] args) throws InterruptedException {
        // volatile: 다른 스레드의 신호를 즉시 감지
        Thread worker = new Thread(() -> {
            System.out.println("Worker 시작");
            while (running) { /* 작업 중 */ }
            System.out.println("Worker 종료 감지");
        });
        worker.start();
        Thread.sleep(100);
        running = false; // volatile 덕분에 worker 스레드가 즉시 감지
        worker.join();

        // AtomicInteger vs 일반 int
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    atomicCounter.incrementAndGet(); // 원자적 증가
                    unsafeCounter++;                 // race condition 발생 가능
                }
            });
            threads[i].start();
        }
        for (Thread t : threads) t.join();

        System.out.println("AtomicInteger: " + atomicCounter.get() + " (기대: 100000)");
        System.out.println("unsafeCounter: " + unsafeCounter + " (손실 발생 가능)");
    }
}
