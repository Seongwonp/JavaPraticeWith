package ch_07_method;

public class My06 {
    //매개 변수를 2개 사용하는 메서드
    void print(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("결과값: " + sum);
    }
    public static void main(String[] args) {
        int num1 = 11;
        short num2 = 22;
        int result1 = 0;

        My06 my06 = new My06();
        my06.print(num1, num2);
    }
}
