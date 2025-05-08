package ch_31_collection_ex.ex_12_hashset;

import java.util.HashSet;
import java.util.Iterator;

/*
    출력결과가 다음처럼 나오도록 Member 클래스를 구현하세요.
    [400:정약용, 100:김유신, 200:강감찬, 300:이순신]
    * 출력 순서는 상관 없음!
 */
public class Test {
    public static void main(String[] args) {
        HashSet<Member> set = new HashSet<>();
        set.add(new Member("100","김유신"));
        set.add(new Member("200","강감찬"));
        set.add(new Member("300","이순신"));
        set.add(new Member("400","정약용"));
        set.add(new Member("100","홍길동"));

        System.out.println(set);

    }
}
