package ch_09_inheritance_ex.ex_11;

public class Employee {
    /*
        Employee 클래스를 작성하세요.
        이 클래스는 다음과 같은 속성을 가져야 합니다.

        name (문자열): 직원의 이름
        employeeId (정수): 직원의 고유 식별자
        salary (정수): 직원의 급여

        Employee 클래스에는 다음과 같은 메서드가 있어야 합니다.

        Employee 생성자: 이름, 고유 식별자, 급여를 매개변수로 받아 초기화합니다.
        calculateSalary() 메서드: 직원의 급여를 계산하여 반환합니다. (기본적으로 salary 값을 반환)
     */

    private String name;
    private int employeeId;
    private int salary;


    public Employee(String name, int employeeId, int salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int calculateSalary() {
        return salary;
    }

}
