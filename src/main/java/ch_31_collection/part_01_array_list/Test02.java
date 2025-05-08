package ch_31_collection.part_01_array_list;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        //String 객체를 저장한느 ArrayList
        ArrayList<String> list = new ArrayList<>();

        //String 객체 저장
        list.add("Java");
        list.add("JDBC");
        list.add("Serverlet/JSP");
        list.add(2,"Database");
        list.add("iBATIS");
        int size = list.size();
        System.out.println("Total size: " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2: " + skill);
        System.out.println();

        System.out.println("list: " + list);
        System.out.println();

        System.out.println("Use \"for\" loop");
        for(int i = 0; i < size; i++) {
            System.out.println("i: " + list.get(i));
        }
        System.out.println();

        System.out.println("Use \"for-each\" loop");
        for(String str: list){
            System.out.println(str);
        }

        list.remove(2); //2번 인덱스 Database 삭제
        list.remove(2); //2번 인덱스 Serverlet/JSP 삭제
        list.remove("iBATIS");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }

    }
}
