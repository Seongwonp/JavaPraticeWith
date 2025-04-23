package ch_08_class.part_04_student;

public class Test03 {
    public static void main(String[] args) {
        //참조 변수 복사
        Student student1 = new Student();
        student1.name = "홍길동";

        Student student2 = new Student();
        student2.name = "김철수";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.getName());
        System.out.println(student2.getName());


        student1 = student2;
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.getName());
        System.out.println(student2.getName());


    }
}
