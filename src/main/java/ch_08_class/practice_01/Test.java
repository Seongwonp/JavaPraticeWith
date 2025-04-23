package ch_08_class.practice_01;



public class Test {
    public static void main(String[] args) {
        A a = new A();
        //a.a = 10; //전용 멤버는 다른 클래스에서 접근이 안됨
        a.b=20;
        a.c=30;
    }
}
