package ch_31_collection.member.arrayList;

import ch_31_collection.member.MemberDTO;
import java.util.*;

public class MemberArrayList {
    private  List<MemberDTO> members;

    public MemberArrayList() {
        members = new ArrayList<>();
    }

    public void addMember(MemberDTO memberDTO) {
        members.add(memberDTO);
    }

    public boolean removeMember(int memberId) {
        Iterator<MemberDTO> iterator = members.iterator(); //임시 저장공간 아이터레이터 사용
        while (iterator.hasNext()) {
            MemberDTO member = iterator.next();
            if (member.getMemberId() == memberId) {
                System.out.println("Removed member \"" + memberId + "\" from member list!\n");
                iterator.remove(); // 안전하게 삭제
                return true;
            }
        }
        System.out.println("MemberId \"" + memberId + "\" not found\n");
        return false;
    }

    public void showMembers(){
        for(MemberDTO member : members){
            System.out.println(member);
        }
    }



}
