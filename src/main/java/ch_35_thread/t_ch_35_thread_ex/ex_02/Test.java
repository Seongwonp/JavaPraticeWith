package ch_35_thread.t_ch_35_thread_ex.ex_02;

import java.util.concurrent.*;

// 연습: BlockingQueue로 생산자-소비자 패턴 구현
public class Test {
    public static void main(String[] args) throws InterruptedException {
        /*
            BlockingQueue: 스레드 안전한 큐
            - put(): 큐가 가득 차면 대기
            - take(): 큐가 비어있으면 대기
            → synchronized 없이 생산자-소비자 패턴 구현 가능
         */
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    queue.put(i);
                    System.out.println("생산: " + i + " (큐 크기: " + queue.size() + ")");
                    Thread.sleep(100);
                } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        }, "Producer");

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    int item = queue.take();
                    System.out.println("  소비: " + item);
                    Thread.sleep(200);
                } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        }, "Consumer");

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        System.out.println("완료");
    }
}
