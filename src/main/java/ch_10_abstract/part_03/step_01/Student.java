package ch_10_abstract.part_03.step_01;

import lombok.*;

@AllArgsConstructor
@Getter
public class Student {
    private String name;
    private int grade;

    public String getStudentInfo(){
        System.out.println("Student 클래스의 getStudentInfo()메소드 호출");
        return "이름은: " + name + ", 학년은: " + grade;
    }

    public String getTeacher(){
        return "김길동 선생님";
    }

}
