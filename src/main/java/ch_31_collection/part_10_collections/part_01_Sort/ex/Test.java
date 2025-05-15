package ch_31_collection.part_10_collections.part_01_Sort.ex;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Student[] array = {
                new Student(2,"김철수"),
                new Student(3,"이철수"),
                new Student(1,"박철수")
        };
        List<Student> list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println(list); // compareTo가 number 기준이기 때문에 sort도 number 기준으로 정렬
    }
}
