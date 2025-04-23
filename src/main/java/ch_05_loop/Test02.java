package ch_05_loop;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        //별출력
        Scanner scanner = new Scanner(System.in);

        int line;
        line = scanner.nextInt();
        //직각삼각형
        for(int i = 0; i <line; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");
        //역삼각형
        for(int i = 0; i <line; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<=line-i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n");

        for(int i = line; i>0; i--){
            for(int j = 0; j<line - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<=2*i-2; k++){
                System.out.print("*");
            }
         System.out.println();
        }
        System.out.println("\n\n");

        for(int i = 0; i<=line; i++){
            for(int k = 0; k<line-i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
