package ch_31_collection.member.treeset;

import ch_31_collection.member.MemberDTO;

public class Test {
    public static void main(String[] args) {
        MemberTreeSet members = new MemberTreeSet();
        MemberDTO memberLee = new MemberDTO(1001,"이지원");
        MemberDTO memberSon = new MemberDTO(1002,"손민국");
        MemberDTO memberPark = new MemberDTO(1003,"박서훤");

        members.addMember(memberLee);
        members.addMember(memberSon);
        members.addMember(memberPark);
/*
        //간략화
        members.addMember(new MemberDTO(1001,"이지원"));
        members.addMember(new MemberDTO(1002,"손민국"));
        members.addMember(new MemberDTO(1003,"박서훤"));
*/

        members.showAllMembers();



        members.addMember(memberLee); //중복된 객체 저장.
        members.showAllMembers(); //중복된 객체는 저장되지 않음.

        MemberDTO memberHong = new MemberDTO(1003,"홍길동"); //1003 아이디 중복 회원 추가.
        members.addMember(memberHong);
        members.showAllMembers();

        members.removeMember(1002);
        members.showAllMembers();
    }
}
