package ch_31_collection.part_08_hashmap.part_02;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<Student, Integer> scores = new HashMap<>();
        scores.put(new Student(1,"홍길동"),95);
        scores.put(new Student(1,"홍길동"),95);
        scores.put(new Student(1,"박유신"),85);
        System.out.println("Total Scores : " + scores.size());

    }
}
