package ch_08_class_ex.ex07;

public class Test {
    /*
        클래스 작성 및 접근 제어
        * Person 이라는 클래스를 작성하고 테스트 하라.
        * Person 이라는 클래스는 다음과 같은 필드와 메서드를 가진다.
        * # 필드
        * name : 이름 (private)
        * mobile : 핸드폰 번호 (private)
        * office : 직장 전화번호 (private)
        * email : 이메일 주소 (private)
        *
        * # 메서드
        * Person(name, mobile, office, email) : 생성자 메서드
        * printInfo() : 객체의 정보를 문자열로 변환하는 메서드
        * setName(), getName()... : 각 속성에 대한 접근자와 설정자 메서드
        *
     */


    public static void main(String[] args) {
        Person person1 = new Person("김철수","010-1234-1234","053-123-1234","chalsoo@gmail.com");
        System.out.println(person1);

        Person person2 = new Person();
        person2.setName("홍길동");
        person2.setMobile("010-4321-4321");
        person2.setOffice("053-321-3210");
        person2.setEmail("gilldong@gmail.com");
        System.out.println(person2);
    }
}
