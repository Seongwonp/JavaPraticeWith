package ch_39_design_patton.part_03_factory.part_01;

//객체 생성 클래스
public class CoffeeFactory {
    public static Coffee getCoffee(String type, int price){
        if (type == null) {
            return new DefaultCoffee();
        }

        return switch (type.toLowerCase()) {
            case "americano" -> new Americano(price);
            case "latte" -> new Latte(price);
            default -> new DefaultCoffee();
        };
    }
}
