package ch_10.ch_10_abstract.t_ch_10_abstract_ex.ex_03;
/*
    Member 추상 클래스를 상속받는 RegularMember 클래스를 작성하세요.
    RegularMember 클래스는 다음과 같은 속성을 가져야 합니다.

    name (문자열): 회원의 이름
    membershipYear (정수): 회원 가입 연도
    RegularMember 클래스에는 calculateAnnualFee() 메서드를 오버라이딩하여 정회원의 연간 회비를 계산하는 구체적인 구현을 제공하세요.
    연간 회비는 가입 연도에 따라 다음과 같이 정해집니다.

    가입 연도가 3년 이하인 경우: 100달러
    가입 연도가 4년 이상인 경우: 80달러

 */
public class RegularMember extends Member {
    public RegularMember(String name, int membershipYear) {
        super(name, membershipYear);
    }

    @Override
    public void calculateAnnualFee(){
        int year = getTHIS_YEAR() - getMembershipYear();
        int annualFee;
        if(year<=3){ annualFee = 100;}
        else { annualFee = 80; }
        System.out.println(getName() + " Join at " + getMembershipYear() + " (" + year + ")");
        System.out.println("[Regular] Annual Fee for " + getName() + " is " +annualFee );
    }
}
