package ch_08_class.part_04_student;

public class Test02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("홍길동");
        s1.setGrade(3);
        s1.setKor(88);
        s1.setEng(90);
        s1.setMath(100);

        System.out.println(s1.getName());
        System.out.println(s1.getGrade());
        System.out.println(s1.getKor());
        System.out.println(s1.getEng());
    }
}
