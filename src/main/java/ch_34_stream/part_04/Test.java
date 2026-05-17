package ch_34_stream.part_04;

import java.util.*;
import java.util.stream.*;

public class Test {

    record Product(String name, String category, int price) {}

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("MacBook",    "전자기기", 1500000),
            new Product("iPhone",     "전자기기",  900000),
            new Product("청바지",      "의류",      50000),
            new Product("티셔츠",      "의류",      20000),
            new Product("운동화",      "신발",      80000),
            new Product("AirPods",    "전자기기",  200000),
            new Product("구두",        "신발",     120000)
        );

        // groupingBy: 카테고리별로 그룹화
        Map<String, List<Product>> byCategory =
                products.stream().collect(Collectors.groupingBy(Product::category));
        byCategory.forEach((cat, list) -> {
            System.out.print("[" + cat + "] ");
            list.forEach(p -> System.out.print(p.name() + " "));
            System.out.println();
        });

        // groupingBy + counting
        System.out.println("\n카테고리별 상품 수:");
        Map<String, Long> countByCategory =
                products.stream().collect(Collectors.groupingBy(Product::category, Collectors.counting()));
        countByCategory.forEach((k, v) -> System.out.println("  " + k + ": " + v + "개"));

        // groupingBy + summingInt: 카테고리별 총 가격
        System.out.println("\n카테고리별 총 가격:");
        Map<String, Integer> sumByCategory =
                products.stream().collect(Collectors.groupingBy(
                        Product::category, Collectors.summingInt(Product::price)));
        sumByCategory.forEach((k, v) -> System.out.printf("  %-8s: %,d원%n", k, v));

        // toMap: 이름 → 가격 매핑
        Map<String, Integer> priceMap =
                products.stream().collect(Collectors.toMap(Product::name, Product::price));
        System.out.println("\nMacBook 가격: " + priceMap.get("MacBook"));

        // partitioningBy: 조건으로 true/false 두 그룹 분류
        Map<Boolean, List<Product>> partitioned =
                products.stream().collect(Collectors.partitioningBy(p -> p.price() >= 100000));
        System.out.println("\n10만원 이상: " + partitioned.get(true).stream().map(Product::name).toList());
        System.out.println("10만원 미만: " + partitioned.get(false).stream().map(Product::name).toList());
    }
}
