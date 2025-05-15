package ch_39_design_patton.part_03_factory.part_01;

public class DefaultCoffee extends Coffee {
    public DefaultCoffee() {
        this.price = -1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
