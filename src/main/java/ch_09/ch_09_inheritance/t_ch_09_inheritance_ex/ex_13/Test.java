package ch_09.ch_09_inheritance.t_ch_09_inheritance_ex.ex_13;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
/*
   문제: 학생과 성적 관리 시스템

    3. Main 클래스에서 다음과 같은 작업을 수행하세요.
    Student 객체와 HighSchoolStudent 객체를 각각 생성하고, 평균 성적을 출력하세요. (오버라이딩된 calculateAverageGrade() 메서드 활용)
    이 문제를 해결하기 위해 Student, HighSchoolStudent 클래스를 작성하고,
    메서드 오버라이딩을 통해 평균 성적을 계산하고 출력하세요. 그리고 Main 클래스에서 객체를 생성하여 평균 성적을 확인하세요.

    4. 예를 들어, 고등학교 학년에 따라 다음과 같은 가중치를 부여할 수 있습니다.
    1학년: 국어 30%, 영어 30%, 수학 20%, 과학 20%
    2학년: 국어 25%, 영어 25%, 수학 25%, 과학 25%
    3학년: 국어 20%, 영어 20%, 수학 30%, 과학 30%
    각 학년별로 가중치를 다르게 설정한 후, 해당 가중치를 과목 성적과 곱하여 가중합을 계산하고, 학년에 따른 가중평균 성적을 구할 수 있습니다.

    예를 들어, 1학년 학생의 성적이 다음과 같다고 가정하겠습니다.

    국어: 90
    영어: 85
    수학: 78
    과학: 92
    그리고 위에서 정의한 가중치를 사용하여 1학년 학생의 가중평균 성적을 계산하면:

    (90 * 0.3) + (85 * 0.3) + (78 * 0.2) + (92 * 0.2) = 27 + 25.5 + 15.6 + 18.4 = 86.5

    1학년 학생의 가중평균 성적은 86.5가 됩니다
 */
@Log4j2
public class Test {
    public static void main(String[] args) {
        Student student = new Student("tom",101,Arrays.asList(93,87,73,89));
        log.info(student.getName() +"학생의 평균: "+student.calculateAverageGrade());

        HighSchoolStudent highSchoolStudent
                = new HighSchoolStudent("john",102,Arrays.asList(90,85,78,92),1);
        log.info("고등학생 " + highSchoolStudent.getName() + "의 평균: "
                + highSchoolStudent.calculateAverageGrade());

    }
}
