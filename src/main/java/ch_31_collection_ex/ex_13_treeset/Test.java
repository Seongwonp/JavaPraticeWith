package ch_31_collection_ex.ex_13_treeset;


import java.util.*;

public class Test {
    public static void main(String[] args) {
        TreeSet<Member> set = new TreeSet<>();
        set.add(new Member("100","김유신"));
        set.add(new Member("200","강감찬"));
        set.add(new Member("300","이순신"));
        set.add(new Member("400","정약용"));
        set.add(new Member("100","홍길동"));

        System.out.println(set);
    }
}
