package ch_08_class.access.socre.step_01;

public class Test {
    public static void main(String[] args) {
        Score score = new Score();
        score.kor = -50; //잘못된 값이 입력되더라도 제어 불가능
        score.eng = 70;
        score.math = 30;
    }
}
