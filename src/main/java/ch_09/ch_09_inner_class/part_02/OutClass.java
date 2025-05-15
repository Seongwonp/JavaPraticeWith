package ch_09.ch_09_inner_class.part_02;


public class OutClass {
    private int num = 10;
    private static int sNum = 20;

    static class InStaticClass{ //static 내부 클래스
        int inNum=100;
        static int sinNum =200;

        void inTest(){ //정적 클래스의 일반(인스턴스) 메서드
            //num++; // 외부 클래스의 인스턴스 변수는 사용할 수 없음
            // -> 외부 클래스 객체를 생성하지 않고 바로 정적 내부 클래스의 객체 생성할 수 있어서 외부 클래스의 인스턴스 변수 사용을 막음.
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sinNum = " + sinNum + "(내부 클래스의 스태틱 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");

        }

        static void sTest(){ // 정적 클래스의 정적 메서드
            //num++; // 외부 클래스의 인스턴스 변수는 사용할 수 없음
            //inNum++; //내부 클래스의 인스턴스 변수는 사용할 수 없음
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
            System.out.println("InStaticClass sinNum = " + sinNum + "(내부 클래스의 스태틱 변수 사용)");
        }
    }

    public void outTest(){
        System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수 사용)");
    }

}
