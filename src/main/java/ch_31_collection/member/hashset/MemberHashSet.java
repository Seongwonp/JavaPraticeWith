package ch_31_collection.member.hashset;

import ch_31_collection.member.MemberDTO;
import java.util.*;

public class MemberHashSet {
    private final Set<MemberDTO> members;

    public MemberHashSet() {
        members = new HashSet<>(); // HashSet 생성
    }

    public void addMember(MemberDTO memberDTO) {

        members.add(memberDTO); //HashSet에 회원추가
    }

    public boolean removeMember(int memberId) {
        //매개변수로 받은 회원 아이디에 해당하는 회원 삭제.
        Iterator<MemberDTO> iterator = members.iterator();
        while (iterator.hasNext()) {
            MemberDTO memberDTO = iterator.next();
            if (memberDTO.getMemberId() == memberId) {
                members.remove(memberDTO);
                System.out.println("Member " + memberDTO.getMemberId() + " removed :)");
                return true;
            }
        }
        System.out.println(memberId + " not found :(");
        return false;
    }

    public void showAllMembers() {
        //모든 회원 출력
        System.out.println("-----------------------------------");
        System.out.println("Total members: " + members.size());
        for (MemberDTO memberDTO : members) {
            System.out.println(memberDTO);
        }
        System.out.println();

    }

}
