package ch_09.ch_09_inner_class.part_01;

public class OuterClass {
    private final int value = 10;

    class InnerClass{
        public void myMethod(){
            //내부 클래스 안에서는 외부 클래스의 private 변수들을 참조할 수 있음.
            System.out.println("In inner class");
            System.out.println("외부 클래스의 private 변수 값 : " + value);
        }
    }

    public OuterClass(){
        System.out.println("In outer class");
        InnerClass obj = new InnerClass(); // 내부 클래스 사용
        obj.myMethod();
        System.out.println("process is over");
    }

}
