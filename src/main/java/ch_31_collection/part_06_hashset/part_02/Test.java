package ch_31_collection.part_06_hashset.part_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("Java");
        strings.add("JDBC");
        strings.add("Servlet/JSP");
        strings.add("Java"); //중복되므로 하나만 출력
        strings.add("iBATIS");

        int size = strings.size();
        System.out.println("Total size: " + size);

        //1. 순회: foreach
        // -> for 문은 set이 인덱스를 지원하지 않기 때문에 사용하지 못함.
        System.out.println("1) Print strings by for-each");
        for (String s : strings) {
            System.out.println("\t" + s);
        }
        System.out.println();

        //2. 순회 : Iterator
        Iterator<String> iterator = strings.iterator();
        System.out.println("2) Print strings by Iterator");
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println("\t" + s);
        }
        System.out.println();


        //삭제
        System.out.println("Remove JDBC, iBATIS");
        strings.remove("JDBC");
        strings.remove("iBATIS");
        System.out.println("Total size: " + strings.size());
        System.out.println(strings);
        System.out.println();

        System.out.println("Strings clear");
        strings.clear();
        if(strings.isEmpty()){
            System.out.println("Strings is empty!");
        }





    }
}
