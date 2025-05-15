package ch_10.ch_10_interface.t_ch_10_interface_ex.ex_02;


/*
    4. Main 클래스에서 다음과 같은 작업을 수행하세요.

    RegularMember 객체와 VIPMember 객체를 각각 생성하고, getMemberInfo() 메서드를 호출하여 회원 정보를 출력하세요.
    이 문제를 해결하기 위해 Member 인터페이스를 작성하고, 이를 구현하는 RegularMember 및 VIPMember 클래스를 작성하세요.
    반복문을 이용하여 각 클래스에서 getMemberInfo() 메서드를 오버라이딩하여 회원 정보를 문자열로 반환하세요.
    그리고 Main 클래스에서 객체를 생성하여 회원 정보를 확인하세요.
 */
public class Test {
    public static void main(String[] args) {
        Member[] members = {new RegularMember("1","홍길동",2019),
        new VIPmember("2","김지수",5)};
        for (Member member : members) {
            System.out.println(member.getMemberInfo());
        }

    }
}
