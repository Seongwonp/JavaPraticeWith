package ch_08_class_ex.singleon;

public class ShopService {

    private static ShopService shopService = null;
    private ShopService(){}

    public static ShopService getInstance() {
        if (shopService == null) {
            shopService = new ShopService();
        }
        return shopService;
    }

}
