package ch_09.ch_09_inheritance.polymorphism.Part_02;

class Shape{
    protected int x,y;
    public void draw(){
        System.out.println("Shape Draw");
    }
}

class Rectangle extends Shape{
    public int width,height;

    @Override
    public void draw(){
        System.out.println("Rectangle Draw");
    }
}

class Triangle extends Shape{
    public int base, height;

    @Override
    public void draw(){
        System.out.println("Triangle Draw");
    }
}

class Circle extends Shape{
    public int radius;

    @Override
    public void draw(){
        System.out.println("Circle Draw");
    }
}

public class Test {
    public static void main(String[] args) {
        Shape shape1, shape2;
        shape1 = new Shape();
        shape2 = new Rectangle();
    }





}
