package ch_09.ch_09_inner_class.part_01;

public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println();

        //outer 객체 안에 정의된 innerClass 라는 의미
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.myMethod();
    }
}
