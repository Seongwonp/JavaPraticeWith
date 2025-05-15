package ch_10.ch_10_abstract.part_03.step_03;

public class University extends Student {
    private int  courses; //신청학점

    public University(String name, int grade, int courses) {
        super(name, grade);
        this.courses = courses;
    }

    @Override
    public String getStudentInfo() {
        return super.getStudentInfo() + "신청 학점: " + courses;
    }

    public String getProfessor(){
        return "이경수 교수님";
    }


}
