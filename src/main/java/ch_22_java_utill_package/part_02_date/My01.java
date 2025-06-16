package ch_22_java_utill_package.part_02_date;

import java.util.Date;

public class My01 {
    public static void main(String[] args) {
        Date today = new Date(); // 기본 생성자로 Date 인스턴스를 만들고 출력
        System.out.println(today);

        Date day = new Date(System.currentTimeMillis());
        System.out.println(day);

        Date yesterday = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));
        System.out.println(yesterday);

    }
}
