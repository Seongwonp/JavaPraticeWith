package ch_07_method;

public class My10 {


    public static void main(String[] args) {
        printGreet();//
        printGreet("안녕~!");
        printGreet("한수", "잘 지내셨나요?");
        printGreet(9);
    }

    public static void printGreet() {
        System.out.println("printGreet()메서드가 실행됩니다.");
        System.out.println("안녕하세요");
    }

    public static void printGreet(String a, String b) {
        System.out.println("printGreet(String a, String b) 매서드가 실행됩니다.");
        System.out.println(a + " " +  b);
    }

    public static void printGreet(String greeting) {
        System.out.println("printGreet(String greeting) 매서드가 실행됩니다.");
        System.out.println(greeting);
    }

    public static void printGreet(int num) {
        System.out.println("printGreet(int num) 매서드가 실행됩니다.");
        System.out.println("안녕하세요." + num + "번째 보는 거네요.");
    }
}
