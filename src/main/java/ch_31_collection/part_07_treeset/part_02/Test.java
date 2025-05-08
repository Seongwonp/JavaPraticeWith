package ch_31_collection.part_07_treeset.part_02;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>(new MyCompareInt());

        scores.add(90);
        scores.add(100);
        scores.add(85);
        scores.add(65);
        scores.add(50);
        scores.add(75);
        scores.add(90); //중복제거

        System.out.println(scores); // 기본 설정: ASC / MyCompareInt 클래스를 통해 DESC로 변경

    }
}
