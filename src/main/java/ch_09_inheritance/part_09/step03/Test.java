package ch_09_inheritance.part_09.step03;

class Parent{
    public int x = 10;
}

class Child extends Parent{
    public int x = 20;
    public void method(){
        int x = 30;
        System.out.println("x: " + x); // 가까운 변수
        System.out.println("this.x: " + this.x ); // 인스턴스 변수
        System.out.println("super.x: " + super.x); //부모메서드 x 호출
        

    }

}

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }
}
