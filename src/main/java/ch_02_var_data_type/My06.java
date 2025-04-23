package ch_02_var_data_type;

public class My06 {
	public static void main(String[] args) {
		
		//결합연산
		int value = 10+2+8;
		System.out.println("value: " + value); //20
		
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1); //128
		// 연산자는 왼쪽에서 오른쪽으로 순서대로 실행이 되기 때문에 
		//12+"8"이됨 
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2); //1028
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3);
		//문자열이 하나라도 포함이 되면 그 뒤로는 다 문자열로 바뀜 그래서 1028
		
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4); //1010
		//괄호 안에 있는 연산이 우선임 그래서 1010
	}
}
