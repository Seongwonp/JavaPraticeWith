package ch_10.ch_10_abstract.part_03.step_03;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getStudentInfo(){
        System.out.println("Student 클래스의 getStudentInfo()메소드 호출");
        return "이름은: " + name + ", 학년은: " + grade;
    }

    public String getTeacher(){
        return "김길동 선생님";
    }

}
