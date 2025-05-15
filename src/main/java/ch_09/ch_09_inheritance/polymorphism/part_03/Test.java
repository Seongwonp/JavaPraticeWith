package ch_09.ch_09_inheritance.polymorphism.part_03;

class Parent{
    protected int pi = 100;

    public void pDisplay(){
        System.out.println("pDisplay(): pi = " + pi);
    }
}

class Child extends Parent{
    private int ci = 200;
    public void cDisplay(){
        System.out.println("cDisplay(): ci = " + ci);
    }

    @Override
    public void pDisplay(){
        System.out.println("Override pDisplay(): pi = " + pi);
    }
}


public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.pDisplay();
        c.cDisplay();

        //업캐스팅된 상위 클래스형의 참조로는 확장된 하위 클래스의 멤버는 접근할 수 없다.
        Parent c2 = c;
        c2.pDisplay();
        //c2.cDisplay(); 에러발생 (하위 클래스 멤버이기때문에)


        /*
            재정의된 메서드로 업캐스팅이 되면 오히려 상위 클래스의
            매서드가 은닉되고 하위 클래스에서 재정의된 메서드가 호출된다.
        */
        c2.pDisplay();

        Child c3 = (Child) new Parent(); // Exception -> cannot be cast to
        c3.pDisplay();

        //Child c4 = new Parent(); 컴파일 에러

    }
}
