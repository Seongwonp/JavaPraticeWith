package ch_07_method;

public class My05 {
    //매개변수는 있는데, 반환 값이 없는경우
    void print(int number){
        System.out.println("결과값 "+ number);
    }
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 22;
        int result = 0;
        double avg = 4.5;
        My05 my05 = new My05();
        my05.print(10);
        my05.print(num1);
        my05.print(result);
        my05.print((int)avg);
    }
}
