package ch_10.ch_10_interface.part_06;

public class Test {
    /*
        인터페이스 상속하기
        인터페이스 간에도 상속이 가능.
        1) 클래스의 경우 하나의 클래스만 상속 받을 수 있지만, 인터페이스는 '여러 개를 동시에 상속' 받을 수 있음.
        2) 인터페이스 간의 상속은 구현 코드를 통해 기능을 상속하는 것이 아니므로 형 상속 type inheritance 라고 함.
     */

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.x();
        myClass.y();
        myClass.myMethod();

        X x = myClass;
        x.x();

        Y y = myClass;
        y.y();

        MyInterface myInterface = myClass;
        myInterface.x();
        myInterface.y();
        myInterface.myMethod();

    }
}
