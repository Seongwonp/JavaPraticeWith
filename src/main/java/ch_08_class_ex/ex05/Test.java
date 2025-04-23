package ch_08_class_ex.ex05;

public class Test {
    /*
       이전 문제에서 Printer 클래스를 생성하고 println()메서드를 생성했다.
       Printer 객체를 생성하지 않고 아래와 같이 호출할수 잇도록 Printer 클래스를 수정하라.
     */

    public static void main(String[] args) {
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
}
