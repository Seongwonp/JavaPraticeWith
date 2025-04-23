package ch_08_class_ex.singleon;

public class Test {
    public static void main(String[] args) {

        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if (obj1 == obj2) {
            System.out.println("This is the same object");
        } else {
            System.out.println("This is not the same object");
        }
    }

}
