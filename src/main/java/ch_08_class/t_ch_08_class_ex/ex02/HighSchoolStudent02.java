package ch_08_class.t_ch_08_class_ex.ex02;

public class HighSchoolStudent02 {
    String name; //학생 이름
     int ban, no; // 반 번호
     int kor, eng, math; //국영수
     final int SUBJECT_NUM = 3; //과목수

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setBan(int ban){
        this.ban = ban;
    }
    public int getBan(){
        return ban;
    }


    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }

    public void setKor(int kor){
        this.kor = kor;
    }
    public int getKor(){
        return kor;
    }

    public void setEng(int eng){
        this.eng = eng;
    }
    public int getEng(){
        return eng;
    }

    public void setMath(int math){
        this.math = math;
    }
    public int getMath(){
        return math;
    }

    public int getTotal(){
        return kor + eng + math;
    }
    public double getAverage(){
        return getTotal()/(double)SUBJECT_NUM;
    }
}
