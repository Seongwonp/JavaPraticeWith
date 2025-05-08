package ch_31_collection.member.arrayList;

import ch_31_collection.member.MemberDTO;

public class Test {
    public static void main(String[] args) {
        MemberArrayList list = new MemberArrayList();

        MemberDTO memberLee = new MemberDTO(1001,"이지원");
        MemberDTO memberKim = new MemberDTO(1002,"김형수");
        MemberDTO memberGang = new MemberDTO(1003,"강예린");
        MemberDTO memberHong = new MemberDTO(1004,"홍길동");

        list.addMember(memberLee);
        list.addMember(memberKim);
        list.addMember(memberGang);
        list.addMember(memberHong);

        list.showMembers();

        System.out.println();
        list.removeMember(1004);
        list.showMembers();
    }
}
