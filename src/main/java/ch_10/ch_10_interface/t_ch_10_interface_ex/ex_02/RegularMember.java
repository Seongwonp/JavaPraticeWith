package ch_10.ch_10_interface.t_ch_10_interface_ex.ex_02;

import lombok.AllArgsConstructor;

/*
    2. Member 인터페이스를 구현하는 RegularMember 클래스를 작성하세요.
    RegularMember 클래스는 다음과 같은 속성을 가져야 합니다.

    memberID (문자열): 회원의 고유 아이디
    memberName (문자열): 회원의 이름
    membershipYear (정수): 회원 가입 연도
    RegularMember 클래스에서 getMemberInfo() 메서드를 오버라이딩하여 회원 정보를 문자열로 반환하세요.
    반환된 문자열은 아이디와 이름을 포함해야 합니다.

 */
@AllArgsConstructor
public class RegularMember implements Member {
    private String memberID;
    private String memberName;
    private int membershipYear;

    @Override
    public String getMemberInfo() {
        return "memberID: " + memberID + " | memberName: " + memberName + " | membershipYear: " + membershipYear;
    }
}
