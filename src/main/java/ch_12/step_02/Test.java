package ch_12.step_02;

public class Test {
    /*
          두 인터페이스의 '디폴트' 메서드가 중복되는 경우.
          한 클래스가 다중 구현한 인터페이스가 동일한 디폴트 메서드가 있는 경우
          오버라이딩을 해야 함.

     */
    public static void main(String[] args) {
        Customer customer = new Customer();
        //Customer 클래스형인 customer를 Buy 인터페이스형인 buy에 대입하여 형 변환.
        //buy는 Buy 인터페이스의 메서드만 호출가능.
        Buy buy = customer;
        buy.buy();
//        buy.sell();

        Sell sell = customer; //(Sell)customer -> (Sell) 생략가능.
        sell.sell();

//        sell.buy();

        if (sell instanceof Customer) {
            Customer c = (Customer) sell;
            c.buy();
            c.sell();
        }
        customer.order();

    }
}
