package ch_08_class.part_17_car.step_02;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);

        Car car2 = new Car("black","manual",4);
        System.out.println(car2);

        Car car3 = new Car("Blue");
        System.out.println(car3);
    }
}
