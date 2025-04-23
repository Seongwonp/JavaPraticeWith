package ch_08_class.part_04_student;

public class Test01 {

    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "홍길동";

        System.out.println(student1.name);
        System.out.println(student1.getName());

        student1.grade = 1;
        System.out.println(student1.grade);
        System.out.println(student1.getGrade());


    }

}
