package ch_10_abstract.part_03.step_01;

public class Elementary extends Student {
    public Elementary(String name, int grade) {
        super(name, grade);
    }

    public String getClassTeacher(){
        return "박길순 선생님";
    }
}
