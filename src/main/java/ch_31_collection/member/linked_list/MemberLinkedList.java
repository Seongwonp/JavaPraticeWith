package ch_31_collection.member.linked_list;

import ch_31_collection.member.MemberDTO;
import java.util.*;
public class MemberLinkedList {
    private LinkedList<MemberDTO> memberLinkedList;

    public MemberLinkedList(){
        memberLinkedList = new LinkedList<>();
    }
    public void addMember(MemberDTO member){
        memberLinkedList.add(member);
    }
    public boolean removeMember(int memberId){

       for(MemberDTO member: memberLinkedList) {
            if (member.getMemberId() == memberId) {
                System.out.println("Removed member \"" + memberId + "\" from member list!\n");
                memberLinkedList.remove(member);
                return true;
            }
        }
        System.out.println("MemberId \"" + memberId + "\" not found\n");
        return false;
    }

    public void showAllMembers(){
        for (MemberDTO member : memberLinkedList) {
            System.out.println(member);
        }
    }
}
