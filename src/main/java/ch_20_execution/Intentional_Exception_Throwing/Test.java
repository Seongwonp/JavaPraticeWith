package ch_20_execution.Intentional_Exception_Throwing;

//고의로 예외 발생
public class Test {
    public static void main(String[] args) {
        try{
//            Exception exception = new Exception("고의 발생");
//            throw exception;
            throw new Exception("고의 발생"); //위에 두줄을 한줄로 요약
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
