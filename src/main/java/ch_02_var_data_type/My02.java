package ch_02_var_data_type;

public class My02 {

	public static void main(String[] args) {
				//데이터타입 종류
		
				//true/false
				boolean t = true;
				System.out.println(t);
				System.out.println(!t);
				
				
				//정수형 데이터 타입종류
				byte a = 127; // 1바이트
				short b = 32767; // 2바이트
				int c = 2147483647; //4바이트
			    long d = 9223372036854775807L; //8바이트 뒤에 L을 붙혀줘야함
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				
				
			    //실수형 보통 'double'로 사용
				float e = 1.1243342f; //4바이트 뒤에 'f'를 붙혀줘야한다. 범위 초과시 소수점 8자리에서 반올림한다.
				double f = 1.1231254235434354; //8바이트 기본 실수 타입 'double'
				System.out.println(e);
				System.out.println(f);
				
				//문자형
				char g = 'g';
				String h = "My name is James";
				System.out.println(g);
				System.out.println(h);

				
				//아스키 코드
				int alpa = 120;
				int alpa_16 = 0x78;
				char alpa_c = 'x';
				System.out.println((char)alpa);
				System.out.println((char)alpa_16);
				System.out.println(alpa_c);
				
				
	}

}
