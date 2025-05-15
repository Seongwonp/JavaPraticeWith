package ch_12.step_01;

public class Test {
    /*
            한 클래스가 여러 인터페이스를 구현하는 경우
            한클래스가 여러 클래스를 상속 받으면 같은 이름을 가진 메서드 호출이 모호해지는 문제가 발생할 수 있음.
            그래서 자바는 다중 상속을 지원하지 않음.

           하지만 자바에서 인터페이스는 한 클래스가 여러 인터페이스를 구현할 수 있음.
           인터페이스는 구현 코드나 멤버 변수를 가지지 않기 때문에 여러 개를 동시에 구현할 수 있음.
           두 인터페이스에 이름이 같은 추상 메서드ㅡ가 선언되었다고 해도 구현은 클래스에서 이루어 지므로,
           어떤 메서드를 호출해야 하는지 모호하지 않은 것.
     */
    public static void main(String[] args) {
        Customer customer = new Customer();
        //Customer 클래스형인 customer를 Buy 인터페이스형인 buy에 대입하여 형 변환.
        //buy는 Buy 인터페이스의 메서드만 호출가능.
        Buy buy = customer;
        buy.buy();
        buy.info();
//        buy.sell();

        Sell sell = customer; //(Sell)customer -> (Sell) 생략가능.
        sell.sell();
        sell.info();
//        sell.buy();

        if (sell instanceof Customer) {
            Customer c = (Customer) sell;
            c.buy();
            c.sell();
        }
    }
}
