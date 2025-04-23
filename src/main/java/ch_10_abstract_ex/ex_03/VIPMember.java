package ch_10_abstract_ex.ex_03;
/*
    Member 추상 클래스를 상속받는 VIPMember 클래스를 작성하세요.
    VIPMember 클래스는 다음과 같은 속성을 가져야 합니다.

    name (문자열): 회원의 이름
    membershipYear (정수): 회원 가입 연도
    VIPMember 클래스에는 calculateAnnualFee() 메서드를 오버라이딩하여 VIP 회원의 연간 회비를 계산하는 구체적인 구현을 제공하세요.
    VIP 회원의 연간 회비는 항상 50달러입니다.
 */

public class VIPMember extends Member {
    public VIPMember(String name , int membershipYear){
        super(name, membershipYear);
    }

    @Override
    public void calculateAnnualFee(){
        int year = getTHIS_YEAR() - getMembershipYear();
        int annualFee = 50;
        System.out.println(getName() + " Join at " + getMembershipYear());
        System.out.println("[VIP] Annual Fee for " + getName() + " is " + annualFee );
    }
}
