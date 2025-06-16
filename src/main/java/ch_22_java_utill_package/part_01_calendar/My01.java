package ch_22_java_utill_package.part_01_calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
    java.util.Calender : 날짜와 시간을 다루는 클래스.
    Calendar은 추상 클래스이기 떄문에 직접 객체를 생성하지 못하고,
    getInstance() 메서드를 통해서 GregorianCalendar 인스턴스를 생성해야 함.
    getInstance()를 사용하지 않는 방법으로는 직접 GregorianCalendar 클래스로 인스턴스를 생성.
 */
public class My01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = new GregorianCalendar();

        System.out.println(calendar.toString());
        System.out.println(calendar2);
    }
}
