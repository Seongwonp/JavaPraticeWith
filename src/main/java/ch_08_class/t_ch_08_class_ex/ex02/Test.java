package ch_08_class.t_ch_08_class_ex.ex02;

public class Test {
    public static void main(String[] args) {
        HighSchoolStudent student = new HighSchoolStudent();

        student.name = "홍길동";
        student.ban = 1;
        student.no = 1;
        student.kor = 100;
        student.eng = 60;
        student.math = 76;

        System.out.println("이름: " + student.name);
        System.out.println("총점: " + student.getTotal());
        System.out.println("평균: " + student.getAverage());

        System.out.println("\n\n");

        HighSchoolStudent02 st = new HighSchoolStudent02();
        st.setName("김철수");
        st.setBan(1);
        st.setNo(1);
        st.setKor(100);
        st.setEng(60);
        st.setMath(76);
        System.out.println("이름: " + st.getName());
        System.out.println("총점: " + st.getTotal());
        System.out.println("평균: " + st.getAverage());


    }
}
