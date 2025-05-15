package ch_31_collection.part_10_collections.part_01_Sort;

import java.util.*;
//Collections 클래스 안에 정렬 매소드 Sort 사용 방법
public class Sort {
    public static void main(String[] args) {
        String[] sample = {"i","walk","the","line"};

        System.out.println("* String Array");
        List<String> list = Arrays.asList(sample); //배열을 리스트로 변경
        System.out.println("- Before Sort:");
        System.out.println(list);

        System.out.println("- After Sort:");
        Collections.sort(list); // 리스트 정렬
        System.out.println(list);
        System.out.println();

        System.out.println("* Integer Array");
        Integer[] sample_2 = {1,5,2,24,100,4,400,3};
        List<Integer> list2 = Arrays.asList(sample_2);
        System.out.println("- Before Sort:");
        System.out.println(list2);

        System.out.println("- After Sort:");
        Collections.sort(list2);
        System.out.println(list2);

    }
}
