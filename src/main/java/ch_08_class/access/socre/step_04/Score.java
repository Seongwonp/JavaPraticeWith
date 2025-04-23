package ch_08_class.access.socre.step_04;
//
public class Score {
    private int kor;
    private int eng;
    private int math;

    private boolean isInRange(int score){
        if(score>=0 && score<=100){
            return true;
        } else{
            System.out.println(score + " is out of range😢 try again! (0-100)");
            return false;
        }
    }

    public void setKor(int kor) {
        if(isInRange(kor)) {
            this.kor = kor;
        }
    }

    public void setEng(int eng) {
        if(isInRange(eng)) {
            this.eng = eng;
        }
    }

    public void setMath(int math) {
        if(isInRange(math)) {
            this.math = math;
        }
    }

    @Override
    public String toString(){
        return "Kor: "+kor+" Eng: "+eng+" Math: "+math;
    }
}


