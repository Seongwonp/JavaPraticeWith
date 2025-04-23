package ch_08_class.part_04_student;

public class Student {
    //메서드 없는 클래스
    String name; //이름
    int grade; //학년
    int kor; //국어 성적
    int eng; //영어 성적
    int math;//수학 성적

    public String getName(){
       //name을 반환
        return name;
    }

    public void setName(String name){
        //name 을 저장
        this.name = name;
    }

    //getter
    public int getGrade(){
        return grade;
    }
    //setter
    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getKor(){
        return kor;
    }
    public void setKor(int kor){
        this.kor = kor;
    }

    public int getEng(){
        return eng;
    }
    public void setEng(int eng){
        this.eng = eng;
    }

    public int getMath(){
        return math;
    }
    public void setMath(int math){
        this.math = math;
    }

}
