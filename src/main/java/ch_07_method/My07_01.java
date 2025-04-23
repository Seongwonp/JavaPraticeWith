package ch_07_method;

public class My07_01 {
    //매개변수, 반환값이 모두 있는 경우

    double add(double a, double b) {
        return a+b;
    }
    public static void main(String[] args) {
        double num1 = 10.27;
        double num2 = 20.62;
        double result = 0;
        My07_01 my07 = new My07_01();
        result = my07.add(num1, num2);
        System.out.println("결과값: " + result);
        System.out.println("결과값: " + my07.add(num1, num2));
    }
}
