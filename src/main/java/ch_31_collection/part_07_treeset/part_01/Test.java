package ch_31_collection.part_07_treeset.part_01;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("홍길동");
        strings.add("강감찬");
        strings.add("이순신");
        strings.add("강감찬"); //중복 추가 X

        // 1)중복 제거 2)오름차순(ASC)으로 정렬되어 출력
        System.out.println("Number of elements: " + strings.size());
        for (String s : strings) {
            System.out.println(s);
        }


    }
}
