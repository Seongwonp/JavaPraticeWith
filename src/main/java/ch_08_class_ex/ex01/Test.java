package ch_08_class_ex.ex01;


public class Test {
    /*
    현실 세계의 회원을 Member 클래스를 모델링 하려고 한다.
    회원의 데이터로는 이름, 아이디, 패스워드, 나이가 있다.
    이 데이터를 가지고 Member 클래스를 선언하라.

    이름 : name : 문자열
    아이디 : id : 문자열
    패스워드 : password : 문자열
    나이 : age : 정수
     */
    public static void main(String[] args) {
        Member member = new Member();

        member.name = "park";
        member.age = 24;
        member.id = "java";
        member.password = "1234";
        System.out.println(member.name);
        System.out.println(member.age);
        System.out.println(member.id);
        System.out.println(member.password);


    }


}
