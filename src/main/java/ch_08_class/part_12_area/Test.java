package ch_08_class.part_12_area;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Area a = new Area();
        int width, height;
        Scanner scanner = new Scanner(System.in);
        Area.manual();
        System.out.print("가로: ");
        width = scanner.nextInt();
        System.out.print("세로: ");
        height = scanner.nextInt();
        System.out.println("삼각형 넓이: " + a.triangle(width, height));
        System.out.println("사각형 넓이: " + a.rectangle(width, height));
    }
}
