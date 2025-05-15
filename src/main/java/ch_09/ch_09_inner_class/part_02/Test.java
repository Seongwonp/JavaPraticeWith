package ch_09.ch_09_inner_class.part_02;

public class Test {
    public static void main(String[] args) {
        OutClass.InStaticClass staticClass = new OutClass.InStaticClass();
        System.out.println("정적 내부 클래스 인스턴스 메서드 호출");
        staticClass.inTest();
        System.out.println();

        System.out.println("정적 내부 클래스의 정적 매소드 호출");
        OutClass.InStaticClass.sTest();
        System.out.println();

        System.out.println("외부 클래스의 인스턴스 변수 출력");
        OutClass outClass = new OutClass();
        outClass.outTest();
    }
}
