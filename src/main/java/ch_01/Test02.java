package ch_01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class Test02 {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
			만든날짜: 250325
		 */
//		
//		
//		System.out.println("08:57도착");
//		System.out.println();
//		System.out.println("김치우동");
//
//		
		/*
		 1. 프로그램은 주 단위로 위에서 아래로 실행.
		 2. 한줄이 실행되고 다음 줄로 이동을 하면, 이전 줄의 데이터를 기억을 할 수 없음
		 3. 이전 주르이 내용을 저장하고 싶을 때는 변수에 저장.
		*/
		
		
		int a = 1;
		float b = 12/5;
		char c = '밥';
		double d = 1.123312389402221311231111231234;
		boolean t = true;
		String str = "김치우동";
		
		System.out.println("08:57도착");
		System.out.println();
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(!t);
		
		Scanner scanner = new Scanner(System.in);
		LocalDate l = LocalDate.now();
		int year = l.getYear();
		int month = l.getMonthValue();
		int date = l.getDayOfMonth();
		DayOfWeek week = l.getDayOfWeek();
		
		System.out.println(year + "년 " + month + "월 " + date + "일 " + week);
		
	}

}
