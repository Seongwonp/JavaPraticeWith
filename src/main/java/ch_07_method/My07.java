package ch_07_method;

public class My07 {
    //매개변수, 반환값이 모두 있는 경우

    int add(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = 0;
        My07 my07 = new My07();
        result = my07.add(num1, num2);
        System.out.println("결과값: " + result);
        System.out.println("결과값: " + my07.add(num1, num2));
    }
}
