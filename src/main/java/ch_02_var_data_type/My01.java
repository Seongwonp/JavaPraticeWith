package ch_02_var_data_type;
public class My01 {
	
	int x = 1; //전역변수(같은 클래스만 사용 O)
	static int y =1; //전역변수(다른 클래스도 사용가능)
	private static final int SANG_SU =9; //상수
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.out.println("hi");
		//코드는 위에서부터 아래로 실행
		
		//변수에 데이터를 저장하는 이유 =-> 데이터를 블록(스코프)안에서 재사용
		
		//변수에 데이터를 저장하는 방법
		//데이터타입 변수이름 = 저장할 데이터
		String msg = "hi";
		
		//문자열(String)을 저장할수 있는 변수(msg)에 "hi"라는 데이터를 저장
		System.out.println(msg);
		
		
		String msg_1 = "hello";
		System.out.println(msg_1);

	}

}
