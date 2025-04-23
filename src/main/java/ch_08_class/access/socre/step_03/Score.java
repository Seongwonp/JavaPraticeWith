package ch_08_class.access.socre.step_03;

public class Score {
    private int kor;
    private int eng;
    private int math;

    public Score(int kor, int eng, int math){
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void display(){
        System.out.println("Score{ Kor: " + kor + " | Eng: " + eng + " | Math: " + math + " }");
    }

}


