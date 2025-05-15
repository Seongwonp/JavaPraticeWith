package ch_31_collection.t_ch_31_collection_ex.ex_11_hashset;

import java.util.*;

/*
    HashSet에 Student 객체를 저장하려고 한다.
    학번이 같으면 동일한 Student라고 가정하고 중복 저장이 되지 않게 하는 Student 클래스를 만들어라.
 */
public class Test {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student(1,"홍길동"));
        set.add(new Student(2,"신용권"));
        set.add(new Student(1,"조민우"));

        System.out.println("Total students: " + set.size());
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.getStudentId() + "-" + student.getName());
        }
    }


}
