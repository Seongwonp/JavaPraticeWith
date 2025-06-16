package ch_22_java_utill_package.part_01_calendar;

import java.util.Calendar;

public class My03 {
    // set()으로 날짜 지정하기
    public static void main(String[] args) {
        /*
            set() 메서드는 Calendar 인스턴스의 값을 변경할 때 사용.
            두개의 파라미터를 필요로 하며 첫 번쩨 파라미터는 바꿔야 할 항목, 두 번째 파라미터는 바꿀 값을 대입.
            set(바꿔야 할 항목, 바꿀 값);
            set(년, 월, 일);
         */
        Calendar today = Calendar.getInstance();
        Calendar endOfYear = Calendar.getInstance();
        // 1. 현재에서 연말까지 남은 날 구하기
        endOfYear.set(Calendar.MONTH, 11);
        endOfYear.set(Calendar.DATE, 31);
        long diff = endOfYear.getTimeInMillis() - today.getTimeInMillis(); // 연말에서 현재 초를 뻄
        System.out.println("연말까지 남은 날 : " + diff / (24 * 60 * 60 * 1000) + "일");

        // 2. 현재에서 크리스마스까지 남은 날 구하기
        Calendar christmas = Calendar.getInstance();
        christmas.set(today.get(Calendar.YEAR),11,25);

        long diff2 = christmas.getTimeInMillis() - today.getTimeInMillis();
        System.out.println("크리스마스까지 남은 날 : " + diff2 / (24 * 60 * 60 * 1000) + "일");



    }
}
