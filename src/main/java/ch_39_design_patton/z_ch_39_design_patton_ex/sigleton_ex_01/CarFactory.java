package ch_39_design_patton.z_ch_39_design_patton_ex.sigleton_ex_01;
/*
    1) CarFactory()
        싱글턴으로 동작, Car의 객체를 만드는 기능
 */
public class CarFactory {

    private CarFactory(){}

    private static final CarFactory instance = new CarFactory();
    private static int carNum = 10001;
    public static CarFactory getInstance(){
        return (instance == null) ? new CarFactory() : instance;
    }

    public Car createCar(String carName){
        return new Car(carName, carNum++);
    }
}
