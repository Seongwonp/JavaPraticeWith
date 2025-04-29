package ch_20_execption.create_exception.ex_02;
/*
    Exception 클래스를 상속받는 사용자 저으이 예외 클래스 생성.
    예외가 발생할 조건에 고의로 사용자 정의 예외 발생
    1)try-catch로 처리 2) 호출한 쪽으로 예외를 던짐.
 */
class NegativeScoreException extends Exception {
    NegativeScoreException() {
        super("Score can't be a negative number");
    }
}
class Score{
    private int score;
    public void setScore(int score) throws NegativeScoreException {
        this.score = score;
        if(score<0){
            throw new NegativeScoreException();
        }
    }

}

public class Test {
    public static void main(String[] args) {
        Score score = new Score();
        //1) try-catch
        try {
            score.setScore(-10);
        } catch (NegativeScoreException e) {
            System.out.println(e.getMessage());
        }


    }
}
