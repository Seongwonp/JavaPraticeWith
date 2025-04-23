package ch_09_inheritance_ex.ex_12;

public class SeasonalProduct extends DiscountProduct{
    private String season;
    private double seasonalDiscountRate;
    public SeasonalProduct(String name, int productId, double price, double discontRate, String season, double seasonalDiscountRate) {
        super(name, productId, price, discontRate);
        this.season = season;
        this.seasonalDiscountRate = seasonalDiscountRate;
    }


    @Override
    public double calculatePrice() {
        double discount = getDiscontRate() + seasonalDiscountRate;
        return getPrice()*(1-discount);
    }



}
