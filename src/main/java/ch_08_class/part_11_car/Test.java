package ch_08_class.part_11_car;

public class Test {
    /*
        인스턴스 변수는 각각의 인스턴스마다 고유의 저장 공간을 가지고 있기 때문에 독립적으로 고유값을 저장 가능.
        클레스 변수는 모든 인스턴스가 함께 공유, 하나의 참조변수로 값 변경 하더라도 모든 인스턴스 값이 변하게됨.
        인스턴스 생성전에 접근 가능하기때문에 클래스 이름으로 접근이 됨.
     */

    public static void main(String[] args) {
        System.out.println(Car.wheel); // static 클래스 변수는 접근 가능
//        System.out.println(Car.speed); // 인스턴스 변수는  에러발생!!!
        Car car1 = new Car();
        System.out.println(car1.speed);

        Car car2 = new Car();
        System.out.println(car1.speed);
        System.out.println(car2.speed);
        System.out.println(car1.wheel);
        System.out.println(car2.wheel);


        car2.speed = 100;
        car2.wheel = 5;
        System.out.println(car1.speed); //0
        System.out.println(car2.speed); //100
        System.out.println(car1.wheel); //5
        System.out.println(car2.wheel); //5

    }
}
