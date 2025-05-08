package ch_31_collection.part_06_hashset.part_03;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<MemberShip> members = new HashSet<>();

        members.add(new MemberShip("0001","홍길동"));
        members.add(new MemberShip("0001","홍길동"));
        members.add(new MemberShip("0001","박인수"));

        System.out.println("Total Members : " + members.size());

    }
}
