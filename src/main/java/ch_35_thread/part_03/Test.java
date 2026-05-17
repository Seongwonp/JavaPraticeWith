package ch_35_thread.part_03;

import java.util.concurrent.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        /*
            ExecutorService: 스레드 풀(Thread Pool)을 관리하는 고수준 API
            - 스레드 생성/소멸 비용 절감 (풀에서 재사용)
            - Callable + Future: 스레드 결과값 반환 가능 (Runnable은 반환값 없음)
         */

        // 고정 크기 스레드 풀 (스레드 4개)
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Runnable 제출 (반환값 없음)
        executor.submit(() -> System.out.println("[Task1] " + Thread.currentThread().getName()));
        executor.submit(() -> System.out.println("[Task2] " + Thread.currentThread().getName()));

        // Callable 제출 → Future로 결과 수신
        Future<Integer> future1 = executor.submit(() -> {
            Thread.sleep(100);
            return 42;
        });

        Future<String> future2 = executor.submit(() -> {
            Thread.sleep(50);
            return "Hello Future";
        });

        // get(): 결과가 준비될 때까지 블로킹
        System.out.println("future1 결과: " + future1.get());
        System.out.println("future2 결과: " + future2.get());

        // invokeAll: 여러 Callable을 동시 실행하고 모두 완료 대기
        List<Callable<String>> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            final int id = i;
            tasks.add(() -> "작업-" + id + " 완료 (" + Thread.currentThread().getName() + ")");
        }

        List<Future<String>> results = executor.invokeAll(tasks);
        for (Future<String> r : results) {
            System.out.println(r.get());
        }

        executor.shutdown(); // 더 이상 작업 접수 안 함
        executor.awaitTermination(5, TimeUnit.SECONDS); // 완료 대기
        System.out.println("모든 작업 완료");
    }
}
