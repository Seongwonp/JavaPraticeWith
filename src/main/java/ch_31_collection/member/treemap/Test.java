package ch_31_collection.member.treemap;
import ch_31_collection.member.MemberDTO;

public class Test {
    public static void main(String[] args) {
        MemberTreeMap members = new MemberTreeMap();
        MemberDTO memberLee = new MemberDTO(1001,"이지원");
        MemberDTO memberSon = new MemberDTO(1002,"손민국");
        MemberDTO memberPark = new MemberDTO(1003,"박서훤");
        MemberDTO memberHong = new MemberDTO(1004,"홍길동");

        //id 순서 상관없이 회원추가
        members.addMember(memberLee);
        members.addMember(memberHong);
        members.addMember(memberPark);
        members.addMember(memberSon);

        //id 오름차순으로 정렬되서 출력
        members.showAllMembers();

        members.removeMember(1002);
        members.showAllMembers();
    }
}
