package ch_08_class.part_01_car;

public class My02 {
    public static void main(String[] args) {
        //같은 클래스를 가지고 만든 두 객체는 구조는 동일하지만 서로 다른 저장공간을 가짐.
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "red";
        car2.color = "black";
        System.out.println("car1 color: " + car1.color);
        System.out.println("car1 color: " + car2.color);

        car1.speedUp();
        System.out.println("car1 speed: " + car1.speed);
        System.out.println("car2 speed: " + car2.speed);

        System.out.println("car1 wiper: " + car1.wiperOn);
        System.out.println("car2 wiper: " + car2.wiper());


    }
}
