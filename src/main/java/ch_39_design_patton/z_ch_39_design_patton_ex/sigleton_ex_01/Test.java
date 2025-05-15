package ch_39_design_patton.z_ch_39_design_patton_ex.sigleton_ex_01;

public class Test {
    /*
        싱글톤 패턴으로 클래스 구현 연습하기.
        CarFactory(), Car() 클래스 만들기
        자동차 공장이 있다. 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 제작될 때마다
        고유 번호가 부여된다. 자동차 번호가 10001부터 시작되어 자동차가 생성될 때 마다 10002, 10003
        이렇게 번호가 붙도록 자동차 공장 클래스, 자동차 클래스를 만들어 보자.
        두 클래스는 다음 테스트 코드가 수행 될 수 있도록 구현.

        1) CarFactory()
        싱글턴으로 동작, Car의 객체를 만드는 기능

        2) Car()
        고유번호가 부여. 자동차 번호가 10001부터 시작되어 자동차가 생성될 때 마다 10002, 10003 번호가 붙도록 .
     */
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar("소나타");
        Car myGenesis = factory.createCar("제네시스");

        System.out.println(mySonata.getCarNumber());
        System.out.println(myGenesis.getCarNumber());

        System.out.println(mySonata.getCarName());
        System.out.println(myGenesis.getCarName());
    }
}
