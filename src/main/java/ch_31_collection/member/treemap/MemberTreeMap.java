package ch_31_collection.member.treemap;

import ch_31_collection.member.MemberDTO;
import java.util.*;

public class MemberTreeMap {
    private final Map<Integer, MemberDTO> members;

    public MemberTreeMap() {
        members = new TreeMap<>(); // HashSet 생성
    }

    public void addMember(MemberDTO memberDTO) {

        members.put(memberDTO.getMemberId(), memberDTO); //HashMap에 회원추가
    }

    public boolean removeMember(int memberId) {
        //매개변수로 받은 회원 아이디에 해당하는 회원 삭제.
        if(members.containsKey(memberId)){
            members.remove(memberId);
            System.out.println("Member " + memberId + " removed :)");
            return true;
        }
        System.out.println(memberId + " not found :(");
        return false;
    }

    public void showAllMembers() {
        //모든 회원 출력
        System.out.println("-----------------------------------");
        System.out.println("Total members: " + members.size());
        for(var key : members.keySet()){
            System.out.println(members.get(key));
        }
        System.out.println();

    }
}
