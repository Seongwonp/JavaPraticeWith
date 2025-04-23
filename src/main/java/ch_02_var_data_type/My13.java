package ch_02_var_data_type;

public class My13 {
    final static double PI = 3.14159265358979323846; //전역 상수\
    static double pi = 3.141592; //전역 변수
    public static void main(String[] args) {
        final double PI_2 = 3.14; //지역 상수
        int num=3; // 지역 변수
        System.out.println(num);
        num =4;
        System.out.println(num);
        System.out.println(PI);
        System.out.println(pi);
        // 상수: 프로그램 실행 중에 변경할 수 없는 고정된 값. 변수와는 다르게 대문자로 선언.
        // 형식: final 데이터 타입 상수명 = 값;
        System.out.println(PI_2);
    }
}
