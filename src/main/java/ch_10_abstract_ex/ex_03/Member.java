package ch_10_abstract_ex.ex_03;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*
    Member 추상 클래스를 작성하세요.
    이 클래스는 다음과 같은 추상 메서드를 가져야 합니다.
     calculateAnnualFee(): 회원의 연간 회비를 계산하는 추상 메서드.

     -개인적으로 수정
    name (문자열): 회원의 이름
    membershipYear (정수): 회원 가입 연도
    자식 메소드에서 공통되므로 부모 메서드로 이동
 */


@AllArgsConstructor
@Getter
abstract public class Member {
    private String name;
    private int membershipYear;
    private final int THIS_YEAR = 2025;

    abstract public void calculateAnnualFee();
}
