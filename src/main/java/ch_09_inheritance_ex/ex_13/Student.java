package ch_09_inheritance_ex.ex_13;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

/*
    1. Student 클래스를 작성하세요. 이 클래스는 다음과 같은 속성을 가져야 합니다.

    name (문자열): 학생의 이름
    studentID (정수): 학생의 학번
    grades (배열 또는 리스트): 학생의 성적(국어, 영어, 수학, 과학)을 담고 있는 배열 또는 리스트 (예: [90, 85, 78, 92])

    Student 클래스에는 다음과 같은 메서드가 있어야 합니다.

    Student 생성자: 이름, 학번, 성적을 매개변수로 받아 초기화합니다.
    calculateAverageGrade() 메서드: 학생의 평균 성적을 계산하여 반환합니다.
 */
@AllArgsConstructor
public class Student {
    @Getter
    private String name;
    private int studentID;
    protected List<Integer> grades;

    public double calculateAverageGrade() {
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double)sum / grades.size();
    }
}
