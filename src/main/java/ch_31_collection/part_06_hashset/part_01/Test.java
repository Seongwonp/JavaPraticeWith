package ch_31_collection.part_06_hashset.part_01;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();

        strings.add("임정순");
        strings.add("박현정");
        strings.add("홍연의");
        strings.add("강감찬");
        strings.add("강감찬");

        //중복된 문자열은 제거되고 출력순서와 입력순서는 상관없음
        System.out.println(strings);
    }
}
