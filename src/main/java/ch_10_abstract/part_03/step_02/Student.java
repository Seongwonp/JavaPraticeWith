package ch_10_abstract.part_03.step_02;

import lombok.*;

@AllArgsConstructor
@Getter
abstract public class Student {
    private String name;
    private int grade;
    private String teacher;

    abstract public String getStudentInfo();

    abstract public String getTeacherName();

}
