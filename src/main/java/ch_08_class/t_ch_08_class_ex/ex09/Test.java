package ch_08_class.t_ch_08_class_ex.ex09;

public class Test {
    /*
    강아지를 나타내는 Dog 클래스를 작성한다.
    # 필드
    name : 강아지의 이름. 인스턴스 멤버
    breed : 강아지의 종류. 예를 들면 "요크셔테리어", 인스턴스 멤버
    age : 강아지의 나이. 인스턴스 멤버

    # 메서드
    Dog(name, age) : 강아지의 이름과 나이를 초기화
    Dog(name, breed, age) : 강아지의 이름과 종류, 나이를 초기화
    braking() : 짖음
    setName(), getName()... : 각 속성에 대한 접근자와 설정자 메서드
    toString() : 강아지의 정보를 문자열로 반환

     */

    public static void main(String[] args) {
        Dog dog = new Dog("york","치와와",2);
        System.out.println(dog);
        dog.braking();
    }
}
