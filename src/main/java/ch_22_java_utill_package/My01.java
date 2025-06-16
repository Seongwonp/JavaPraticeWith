package ch_22_java_utill_package;

public class My01 {
    /*
        java.util 패키지
        패키지 중에서 java.lang 패키지를 제외하고 가장 많은 내용을 가지고 있음.

        특징
        1) 언어를 인코딩 해주는 기능
        2) 배열 대신 활용. 배열이 메모리 공간의 크기를 정해 놓고 사용한다면,
        컬렉션은 무한대로 데이터를 넣을 수 있어 배열보다 수정이나 관리가 편리.
        3) 날짜를 관리할 수 있음. 특히 Date, Calender, GregorianCalendar 과 같은 기능을 많이 사용.

        1. 시간 처리
        자바에서는 시간에 대해 처리할 수 있도록 클레스를 제공.
        시간을 다루는 자료형의 값은 long 이며, java.util.Calendar 클래스와 java.util.Date, SimpleDateFormat이 있음.
     */

    public static void main(String[] args) {
/*
         System.currentTimeMillis() : 현재 운영체제의 시각을 long 타입으로 반환.
         -> 반환한 시각은 1970 1월 1일을 기준으로 햇을 떄 현재까지의 시간이며 1/1000초 단위까지 환산해서 보여줌
            메서드가 실행되는 순간의 운영체제 시각을 반환하기 때문에 이용을 하면 작업 소요 시간을 측정.
*/
        long start = System.currentTimeMillis(); // 작업을 시작하기 전의 시간 반환
        System.out.println("시작시간: " + start);
        int num=0;
        for (int i = 0; i < 1000000; i++) {
            num++;
        }
        long end = System.currentTimeMillis(); // 작업이 끝난 후의 시간 반환
        System.out.println("종료시간: " + end);
        System.out.println("걸린시간 : " + (end - start));
    }
}
