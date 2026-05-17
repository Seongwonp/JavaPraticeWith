package ch_32_generics.part_04;

import java.util.Arrays;
import java.util.List;

// 와일드카드 (Wildcard)
public class Test {

    // <?> : 비한정 와일드카드 - 어떤 타입의 List든 읽기 가능 (쓰기 불가)
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // <? extends Number> : 상한 경계 와일드카드 - Number 이하 타입만 허용 (공변)
    public static double sumList(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) total += n.doubleValue();
        return total;
    }

    // <? super Integer> : 하한 경계 와일드카드 - Integer 이상 타입만 허용 (반공변)
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("A", "B", "C");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.print("String List: ");
        printList(strList);

        System.out.print("Integer List: ");
        printList(intList);

        System.out.println("합계: " + sumList(intList));

        List<Number> numList = new java.util.ArrayList<>();
        addNumbers(numList);
        System.out.println("추가 후: " + numList);
    }
}
