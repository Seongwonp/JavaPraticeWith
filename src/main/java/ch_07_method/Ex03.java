package ch_07_method;

public class Ex03 {
    static int getMax(int a, int b){
        return a > b ? a : b;
    }

    static int getMax(int a, int b, int c){
        return getMax(getMax(a, b), c);
    }

    public static void main(String[] args) {
        int a,b,c;
        a=10; b=20; c=30;
        System.out.println(a + ", " + b + ", " + c + "중에 제일 큰 수는 " + getMax(a,b,c) + "입니다.");
        System.out.println(a + ", " + b + "중에 제일 큰 수는 " + getMax(a,b) + "입니다.");
    }
}
