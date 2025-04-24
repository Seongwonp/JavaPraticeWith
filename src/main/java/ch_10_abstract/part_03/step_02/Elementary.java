package ch_10_abstract.part_03.step_02;

public class Elementary extends Student {
    public Elementary(String name, int grade,String teacher) {
        super(name, grade,teacher);
    }

    @Override
    public String getStudentInfo(){return "[Elementary] 이름은: " + getName() + ", 학년은: " + getGrade();}

    @Override
    public String getTeacherName(){
        return getTeacher() + " 선생님";
    }
}
