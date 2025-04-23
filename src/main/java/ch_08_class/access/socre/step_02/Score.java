package ch_08_class.access.socre.step_02;

public class Score {
    private int kor;
    private int eng;
    private int math;

    public void setKor(int kor) {
        if(kor>=0 && kor<=100) {
            this.kor = kor;
        } else{
            System.out.println(kor + " is out of range(0-100)");
        }
    }

    public void setEng(int eng) {
        if(eng>=0 && eng<=100) {
            this.eng = eng;
        } else{
            System.out.println(eng + " is out of range(0-100)");
        }
    }

    public void setMath(int math) {
        if(math>=0 && math<=100) {
            this.math = math;
        } else{
            System.out.println(math + " is out of range(0-100)");
        }
    }

    @Override
    public String toString(){
        return "Kor: "+kor+" Eng: "+eng+" Math: "+math;
    }
}


