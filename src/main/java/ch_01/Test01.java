package ch_01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {		
		
		Scanner scanner = new Scanner(System.in);
		String str[] = new String[5];
		char[][] words = new char[str.length][];
		for(int i = 0; i<5; i++)
				str[i] = scanner.next();
		
		for(int j=0; j<str.length; j++) {
			words[j] = str[j].toCharArray();
		}
		
		// 가장 긴 문자열의 길이를 찾음
        int maxLength = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length > maxLength) {
                maxLength = words[i].length;  
            }
        }
        
      
        for (int i = 0; i < maxLength; i++) {  
            for (int j = 0; j < words.length; j++) {
                if (i < words[j].length) {  
                    System.out.print(words[j][i]);  
                }
            }
        }
		
	}
}
