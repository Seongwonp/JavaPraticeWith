package ch_08_class.access.socre.step_04;

public class Test {
    public static void main(String[] args) {
        Score score = new Score();
        score.setKor(-10);
        score.setMath(100);
        score.setKor(90);
        score.setEng(80);

        System.out.println(score);
    }
}
