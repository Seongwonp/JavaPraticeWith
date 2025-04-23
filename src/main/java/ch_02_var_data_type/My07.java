package ch_02_var_data_type;

public class My07 {

	public static void main(String[] args) {

		//문자열과 정수 연산을 하게 되면 정수가 문자열로 형 번환 됨
		String a = 7 + " ";
		String b = " " + 7;
		String c = 7 + "";
		String d = "" + 7;
		String e = "" + "";
		String f = 7 + 7 + "";
		String g = "" + 7 + 7;
		
		System.out.println(a);//7 
		System.out.println(b);// 7
		System.out.println(c);//7
		System.out.println(d);//7
		System.out.println(e);//
		System.out.println(f);//14
		System.out.println(g);//77
		
	}

}
