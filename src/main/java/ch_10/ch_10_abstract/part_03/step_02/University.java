package ch_10.ch_10_abstract.part_03.step_02;

public class University extends Student {
    private int  courses; //신청학점

    public University(String name, int grade, int courses, String teacher) {
        super(name, grade,teacher);
        this.courses = courses;
    }

    @Override
    public String getStudentInfo() {
        return "[University] 이름은: " + getName() + ", 학년은: " + getGrade() + ", 신청 학점: " + courses;
    }

    @Override
    public String getTeacherName(){
        return getTeacher() +" 교수님";
    }


}
