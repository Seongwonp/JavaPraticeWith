package ch_35_thread.t_ch_35_thread_ex.ex_01;

import java.util.concurrent.*;

// 연습: 여러 URL 요청을 병렬로 시뮬레이션 후 결과 취합
public class Test {
    static String fetchData(String url) throws InterruptedException {
        // 실제 HTTP 요청 대신 지연으로 시뮬레이션
        Thread.sleep((long)(Math.random() * 500 + 100));
        return "[" + url + "] 응답 완료";
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        String[] urls = {"api/users", "api/orders", "api/products", "api/reviews"};

        ExecutorService executor = Executors.newFixedThreadPool(4);

        long start = System.currentTimeMillis();

        // 순차 처리였다면: 최소 400ms 이상 소요
        // 병렬 처리: 가장 느린 요청 시간만큼만 소요
        Future<String>[] futures = new Future[urls.length];
        for (int i = 0; i < urls.length; i++) {
            final String url = urls[i];
            futures[i] = executor.submit(() -> fetchData(url));
        }

        System.out.println("=== API 응답 결과 ===");
        for (Future<String> f : futures) {
            System.out.println(f.get());
        }

        long elapsed = System.currentTimeMillis() - start;
        System.out.printf("총 소요시간: %dms (순차 처리 대비 빠름)%n", elapsed);

        executor.shutdown();
    }
}
