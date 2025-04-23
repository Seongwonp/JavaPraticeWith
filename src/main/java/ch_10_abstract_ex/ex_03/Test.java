package ch_10_abstract_ex.ex_03;
/*
    Test 클래스에서 다음과 같은 작업을 수행하세요.

    RegularMember 객체와 VIPMember 객체를 각각 생성하고, 연간 회비를 출력하세요.
    이 문제를 해결하기 위해 Member 추상 클래스와 이를 상속받는 RegularMember 및 VIPMember 클래스를 작성하고,
    각 클래스에서 calculateAnnualFee() 메서드를 구현하여 연간 회비를 계산하세요.
    그리고 Main 클래스에서 객체를 생성하여 연간 회비를 확인하세요.
 */
public class Test {
    public static void main(String[] args) {
        RegularMember regularMember = new RegularMember("김철수",2018);
        RegularMember regularMember2 = new RegularMember("홍길동",2024);
        VIPMember vipMember = new VIPMember("최수연",2007);
        regularMember.calculateAnnualFee();
        vipMember.calculateAnnualFee();
        regularMember2.calculateAnnualFee();
    }
}
