package ch_39_design_patton.part_03_factory.part_01;

public class Americano extends Coffee {
    public Americano(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
