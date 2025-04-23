package ch_08_class.access.socre.step_02;

public class Test {
    public static void main(String[] args) {
        Score score = new Score();
        score.setKor(-50); //잘못된 값이 입력되면 추가 안됨
        score.setEng(80);
        score.setMath(90);

        System.out.println(score);


        score.setKor(50);

        System.out.println(score);
    }
}
