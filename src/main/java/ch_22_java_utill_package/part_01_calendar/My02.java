package ch_22_java_utill_package.part_01_calendar;

import java.util.Calendar;

public class My02 {
    //get() 메서드로 정보 가져오기
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        /*
            Calendar 클래스에서 데이터를 얻어 오려면 get() 메서드를 사용.
            get() 메서드의 반환 타입은 int 이며, 주의할 점은 월(MONTH) 반환시 실제 월보다 1이 작은 값이 반환.
         */

        // 현재 날짜 구하기
        int year = calendar.get(Calendar.YEAR);
        int Month = calendar.get(Calendar.MONTH)+1;
        int Day = calendar.get(Calendar.DATE);
        System.out.println(year + "년 " + Month + "월 " + Day + "일"); // 현제 날짜 반환

        // 현재 요일 구하기
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        //1 = 일요일 /  2 = 월요일  / 7 = 토요일
        System.out.println(getDayToStr(calendar.get(Calendar.DAY_OF_WEEK)));
    }

    public static String getDayToStr(int day){
        String[] days = {"일","월","화","수","목","금","토"};
        return days[day-1];
    }
}
