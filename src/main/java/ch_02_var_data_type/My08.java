package ch_02_var_data_type;

import java.util.Scanner;

public class My08 {

	public static void main(String[] args) {
		//boolean 참과 거짓을 나타낼때 사용
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		boolean b = true;
		
		if(a>=10)
			b = true;
		else
			b = false;
		
		if(b)
			System.out.println(a + "는 10이상입니다.");
		else
			System.out.println(a + "는 10보다 작습니다.");
		
		
		
		
		boolean stop = true;
		if(!stop)
			System.out.println("STOP");
		else
			System.out.println("START");
		
		
		
		
		
	}

}
