package ch_08_class_ex.ex04;

public class Test {
    /*
       오버로딩
       Printer 객체를 생성하고 println() 메서드를 호출해서 매개값을 콘솔에 출력하려고 한다.
       println() 메서드의 매개값ㅇ르ㅗ int, boolean, double, String 값을 줄 수 있다.
       Printer 클래스에서 println() 메서드를ㄹ 선언하라.
     */

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}
