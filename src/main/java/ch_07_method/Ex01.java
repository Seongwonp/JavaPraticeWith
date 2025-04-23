package ch_07_method;

public class Ex01 {

    static String checkEvenOdd(int num) {
        return num %2 ==0 ? "짝수" : "홀수";
    }
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(4));
        System.out.println(checkEvenOdd(7));
    }
}
