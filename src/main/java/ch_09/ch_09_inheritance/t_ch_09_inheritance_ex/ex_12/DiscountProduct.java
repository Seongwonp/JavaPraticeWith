package ch_09.ch_09_inheritance.t_ch_09_inheritance_ex.ex_12;

public class DiscountProduct extends Product{
    private double discontRate;
    public DiscountProduct(String name, int productId, double price, double discontRate) {
        super(name, productId, price);
        this.discontRate = (discontRate >= 0.0 && discontRate <= 1.0) ? discontRate : 0.0;
        
    }

    public double getDiscontRate() {
        return discontRate;
    }

    @Override
    public double calculatePrice(){
        return getPrice()*(1-discontRate);
    }
    
}
