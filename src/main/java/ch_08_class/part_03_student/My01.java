package ch_08_class.part_03_student;

import java.util.Scanner;

public class My01 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "John";
        student1.grade = 3;
        student1.kor = 78;
        student1.eng = 90;
        student1.math = 100;

        Student student2 = new Student();
        student2.name = "Jane";
        student2.grade = 2;
        student2.kor = 80;
        student2.eng = 90;
        student2.math = 100;

        Student student3 = new Student();
        student3.name = "Jack";
        student3.grade = 1;
        student3.kor = 80;
        student3.eng = 90;
        student3.math = 100;

        student1.printStudent();

        System.out.println();

        student2.printStudent();
        System.out.println();

        student3.printStudent();
    }

}
