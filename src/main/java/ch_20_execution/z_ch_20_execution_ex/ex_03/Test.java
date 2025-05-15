package ch_20_execution.z_ch_20_execution_ex.ex_03;
/*
    Exception 클래스를 상속받는 사용자 저으이 예외 클래스 생성.
    예외가 발생할 조건에 고의로 사용자 정의 예외 발생
    1)try-catch로 처리 2) 호출한 쪽으로 예외를 던짐.

    - 0~100점만 입력 가능하도록 예외 변경
 */

class ScoreOutOfBoundsException extends Exception {
    ScoreOutOfBoundsException() { super("The score can't be over between 0 to 100"); }
}

class Score{
    private int score;
    public void setScore(int score) throws ScoreOutOfBoundsException {
        this.score = score;
        if(score<0 || score>100){
            throw new ScoreOutOfBoundsException();
        }
    }

}

public class Test {
    public static void main(String[] args) {
        Score score = new Score();
        //1) try-catch
        try {
            score.setScore(200);
        } catch (ScoreOutOfBoundsException e){
            System.out.println(e.getMessage());
        }


    }
}
