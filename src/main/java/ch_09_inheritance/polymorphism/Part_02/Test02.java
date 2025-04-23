package ch_09_inheritance.polymorphism.Part_02;

public class Test02 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Triangle();
        shapes[2] = new Circle();


        for(Shape shape : shapes){
            shape.draw();
        }

    }
}
