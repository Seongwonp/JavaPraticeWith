package ch_10.ch_10_interface.part_06;

// 인터페이스 -> 인터페이스 일경우 클래스 상속할 때 사용한 extends 예약어를 그대로 사용.
// 인터페이스 간에는 다중 상속 가능.
public interface MyInterface extends X, Y{
    void myMethod();
}
