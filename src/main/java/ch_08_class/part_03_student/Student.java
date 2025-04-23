package ch_08_class.part_03_student;

public class Student {
    //메서드 없는 클래스
    String name; //이름
    int grade; //학년
    int kor; //국어 성적
    int eng; //영어 성적
    int math;//수학 성적

    void printStudent(){
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Kor: " + kor);
        System.out.println("Eng: " + eng);
        System.out.println("Math: " + math);
        int total = kor + eng + math;
        double average = (double)total / 3;
        System.out.println(name + "'s score average: " + average);
    }


}
