package ch_12.step_02;

public class Customer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("Buy");
    }


    //디폴트 메서드가 중복이 되었으니 두 인터페이스를 구현하는 Customer 클래스에서 재정의 해야함.
    @Override
    public void order() {
        System.out.println("Customer Sell Order");
    }


    @Override
    public void sell() {
        System.out.println("Sell");
    }


    // 두 인터페이스에 이름이 같은 메서드(info())가 선언되었다고 해도
    // 구현은 클래스에서 이루어 지므로, 어떤 메서드를 호출해야 하는지 모호하지 않음!
    @Override
    public void info() {
        System.out.println("Customer");
    }
}
