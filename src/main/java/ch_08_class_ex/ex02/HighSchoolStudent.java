package ch_08_class_ex.ex02;

public class HighSchoolStudent {
    String name; //학생 이름
     int ban, no; // 반 번호
     int kor, eng, math; //국영수
     final int SUBJECT_NUM = 3; //과목수

     int getTotal(){
        return kor + eng + math;
    }

    double getAverage(){
        return getTotal()/(double)SUBJECT_NUM;
    }
}
