package ch_32_generics.part_03;

// 제네릭 타입 경계 (Bounded Type Parameter)
public class Test {

    // <T extends Comparable<T>>: T는 반드시 Comparable을 구현한 타입만 허용
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }

    public static <T extends Comparable<T>> T min(T[] arr) {
        T result = arr[0];
        for (T item : arr) {
            if (item.compareTo(result) < 0) result = item;
        }
        return result;
    }

    // <T extends Number>: 숫자 타입만 허용 → doubleValue() 사용 가능
    public static <T extends Number> double sum(T[] arr) {
        double total = 0;
        for (T item : arr) total += item.doubleValue();
        return total;
    }

    public static void main(String[] args) {
        System.out.println("max(3, 7) = " + max(3, 7));
        System.out.println("max(\"apple\", \"banana\") = " + max("apple", "banana"));

        Integer[] nums = {5, 2, 8, 1, 9, 3};
        System.out.println("min = " + min(nums));

        Double[] prices = {1.5, 2.3, 0.9, 4.1};
        System.out.println("sum = " + sum(prices));
    }
}
