package ch_10_abstract_ex.ex_02;
/*
   Transport라는 추상 클래스를 정의하고, 이를 상속받는 여러 운송 수단 클래스를 만들어 각각의 정보를 출력하는 프로그램을 작성하세요.

    3.	Main 클래스에서 다음을 구현하세요:
    •	Transport 배열 또는 ArrayList를 선언하여 Bus, Train, Airplane 객체를 저장
    •	반복문을 통해 각 객체의 move()와 showInfo()를 호출
    ex)
    도로를 달립니다
    버스 - 이름: 시티버스, 정원: 45명

    레일을 따라 달립니다
    기차 - 이름: KTX, 정원: 300명

    하늘을 날아갑니다
    비행기 - 이름: 대한항공, 정원: 180명
 */
public class Test {
    public static void main(String[] args) {
        Transport[] transports = {
                new Bus("시티버스",45),
                new Train("KTX",300),
                new Airplane("대한한공",180)
        };

        for (Transport t : transports) {
            t.move();
            t.showInfo();
        }

    }
}
