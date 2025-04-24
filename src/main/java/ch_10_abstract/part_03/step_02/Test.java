package ch_10_abstract.part_03.step_02;

import lombok.extern.log4j.Log4j2;

@Log4j2
//추상 메서드 구현 한경우
public class Test {
    public static void main(String[] args) {
        Student[] students = {
                new University("홍길동",3,24, "이경수"),
                new Elementary("박지성",4, "박길순")
        };

        for (Student student : students) {
            log.info(student.getStudentInfo());
            log.info(student.getTeacherName());
        }
    }
    /*
        개발 관리자가 Student 상위 클래스를 만들면서 학생의 담임 선생이나 교수를 구하는
        매서드 getTeacher(), 학생의 정보를 출력하는 getStudentInfo()를 만들었고,
        각 개발자에게 오버라이딩을 하라고 시킴

        하지만 기존의 개발자가 교체되어서 해당 프로젝트에 익숙하지 않은 경우
        관리자의 지시를 잘못 이해해서 Elementary, University 클래스 제작시에
        기능은 유사하지만 이름이 다른 메서드를 만들거나, 메서드를 안 만들게됨.
        이 후에 다른 개발자들이 만든 student를 상속한 클래스와 통일성을 잃어버리게됨.
        현재 프로그래밍 경향은 개발자가 각 기능을 알아서 구현하는 것 보다는 프로젝트의
        규모가 점점 커지므로 향후 유지보수나 관리를 위해서는 누구나 쉽게 소스를 이행하고,
        소스의 구조를 일정하게 유지해야 할필요성이 있음.

        하지만 이런 방식으로 오버라이딩을 구현하면 개발자가 임의로 소스를
        구현할 수 있기 때문에 통일성을 잃어버릴 수 있음

        단순한 프로그램의 개발보다 개발 생산성이 높고, 유지보수가 쉬우며, 기능의 변경이나 확장이 용이한 방식으로 개발
     */
}
