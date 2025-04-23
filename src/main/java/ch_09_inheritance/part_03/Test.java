package ch_09_inheritance.part_03;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.learn();
        student.say();
        Teacher teacher = new Teacher();
        teacher.teach();
        teacher.say();

    }
}
