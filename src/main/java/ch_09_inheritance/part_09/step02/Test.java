package ch_09_inheritance.part_09.step02;

class Parent{
    public int x = 10;
}

class Child extends Parent{
    public int x = 20;
    public void method(){
        System.out.println("x: " + x);
        System.out.println("this.x: " + this.x );
        System.out.println("super.x: " + super.x); //부모메서드 x 호출
        

    }

}

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }
}
