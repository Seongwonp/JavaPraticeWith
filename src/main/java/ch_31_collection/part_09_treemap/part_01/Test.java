package ch_31_collection.part_09_treemap.part_01;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Map<Student, Integer> scores = new TreeMap<>();
        scores.put(new Student(1,"홍길동"),95);
        scores.put(new Student(3,"박유신"),85);
        scores.put(new Student(2,"김신호"),95);

        System.out.println("Total Scores : " + scores.size());
        for(var key : scores.keySet()) {
            System.out.println(key + " : " + scores.get(key));
        }
    }
}
