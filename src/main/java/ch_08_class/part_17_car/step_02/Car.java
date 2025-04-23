package ch_08_class.part_17_car.step_02;

public class Car {
    private String color; //이름
    private String mission; //계좌번호
    private int door;
    public Car(String color, String mission, int door){
        this.color = color;
        this.mission = mission;
        this.door = door;
    }
    public Car(){
//        this.color = "White";
//        this.mission = "auto";
//        this.door = 4;
        this("white","auto",4);

    }
    public Car(String color){
        this(color,"manual",4);
    }
    @Override
    public String toString(){
        return "Car{color: '" + color + "', mission: '" + mission + "', door: " + door + "}";
    }
}
