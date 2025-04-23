package ch_08_class.part_01_car;

public class My01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("시동 처음 초기화 : " + car.powerOn);
        System.out.println("차의 색상 초기화 : " + car.color);
        System.out.println("바퀴의 수 초기화 : " + car.wheel);
        System.out.println("속력 초기화 : " + car.speed);
        System.out.println("와이퍼 작동 초기화 : " + car.wiperOn);


        System.out.println("시동 메서드 동작 : " + car.power());
        System.out.println("시동 메서드 동작 : " + car.power());

        car.color = "black";
        System.out.println("현재 차의 색상: "+ car.color);
    }
}
