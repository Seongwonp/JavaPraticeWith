package ch_09_inheritance_ex.ex_11;

public class Test {
    /*
문제: 직원과 고용 관리 시스템

* 멤버 변수는 private 접근 제한자를 사용하세요.

1. Employee 클래스를 작성하세요.

이 클래스는 다음과 같은 속성을 가져야 합니다.

name (문자열): 직원의 이름
employeeId (정수): 직원의 고유 식별자
salary (정수): 직원의 급여

Employee 클래스에는 다음과 같은 메서드가 있어야 합니다.

Employee 생성자: 이름, 고유 식별자, 급여를 매개변수로 받아 초기화합니다.
calculateSalary() 메서드: 직원의 급여를 계산하여 반환합니다. (기본적으로 salary 값을 반환)

2. FullTimeEmployee 클래스를 작성하세요.
이 클래스는 Employee 클래스를 상속받아야 합니다.

FullTimeEmployee 클래스는 다음과 같은 추가 속성을 가져야 합니다.
monthlySalary (정수): 월별 급여

FullTimeEmployee 클래스에는 다음과 같은 메서드가 있어야 합니다.
FullTimeEmployee 생성자: 이름, 고유 식별자, 월별 급여를 매개변수로 받아 초기화합니다.
calculateSalary() 메서드: 월별 급여를 연봉으로 계산하여 반환합니다. (오버라이딩)

3. ContractEmployee 클래스를 작성하세요.
이 클래스는 FullTimeEmployee 클래스를 상속받아야 합니다.

ContractEmployee 클래스는 다음과 같은 추가 속성을 가져야 합니다.
contractDuration (정수): 계약 기간 (개월)

ContractEmployee 클래스에는 다음과 같은 메서드가 있어야 합니다.
ContractEmployee 생성자: 이름, 고유 식별자, 계약 기간, 월별 급여를 매개변수로 받아 초기화합니다.
calculateSalary() 메서드: 계약 기간에 따라 월별 급여를 연봉으로 계산하여 반환합니다. (오버라이딩)

4. Main 클래스에서 다음과 같은 작업을 수행하세요.

FullTimeEmployee 객체와 ContractEmployee 객체를 각각 생성하고, 연봉을 출력하세요.
(오버라이딩된 calculateSalary() 메서드 활용)

이 문제를 해결하기 위해 Employee, FullTimeEmployee, ContractEmployee 클래스를 작성하고,
메서드 오버라이딩을 통해 연봉을 계산하고 출력하세요.
그리고 Main 클래스에서 객체를 생성하여 연봉을 확인하세요.
 */
    public static void main(String[] args) {
        FulltimeEmployee fulltimeEmployee = new FulltimeEmployee("김지수",1,500);
        ContractEmployee contractEmployee = new ContractEmployee("홍길동",2,10,600);


        System.out.println(fulltimeEmployee.getName() + "님의 연봉은 " + fulltimeEmployee.calculateSalary());
        System.out.println(contractEmployee.getName() + "님의 연봉은 " + contractEmployee.calculateSalary());
    }
}
