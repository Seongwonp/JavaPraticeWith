package ch_09.ch_09_inheritance.polymorphism.Part_02;

public class Test04 {
    public static void print(Shape obj){
        if(obj instanceof Rectangle)
            System.out.println("실제 타입은 Rectangle");
        if(obj instanceof Triangle)
            System.out.println("실제 타입은 Triangle");
        if(obj instanceof Circle)
            System.out.println("실제 타입은 Circle");
    }

    public static void main(String[] args) {
        Rectangle s1 = new Rectangle();
        Triangle s2 = new Triangle();
        Circle s3 = new Circle();

        print(s1);
        print(s2);
        print(s3);
    }

}
