package ch_09_inheritance_ex.ex_02;


public class Test {
    /*
        속성 : 제조사(maker), 모델 이름(model), 색상(color), 현재 속도(curSpeed)
        행위 : 가속(speedUp), 감속(speedDown)

        1. 이 속성과 행위를 바탕으로 하는 Car 클래스를 정의하라.
        단 가속과 감속의 결과는 curSpeed와 연동되어야 한다.

        2. 정의한 Car 클래스에 파라미터로 모든 필드를 초기화하는 생성자를 추가하라.

        3. Car 클래스를 상속받는 SportCar 클래스를 정의하고, 가속과 감속 메서드를 스포츠카에 맞게 오버라이딩하라.

     */
    public static void main(String[] args) {
        Car car1 = new Car("현대","소나타","검정",0);
        Car car2 = new Car("테슬라","모델1","파랑",0);
        SportsCar sportscar = new SportsCar("아우디","a6","회색",0);

        car1.speedUp();
        System.out.println(car1.getCurSpeed());
        System.out.println(car1.getModel());

        sportscar.speedUp();
        System.out.println(sportscar.getCurSpeed());
        System.out.println(sportscar.getModel());
    }
}
