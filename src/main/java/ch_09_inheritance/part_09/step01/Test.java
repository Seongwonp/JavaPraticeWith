package ch_09_inheritance.part_09.step01;

class Parent{
    public int x = 10;
}

class Child extends Parent{
    public void method(){
        System.out.println("x: " + x);
    }

}

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }
}
