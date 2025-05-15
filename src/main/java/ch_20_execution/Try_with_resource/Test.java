package ch_20_execution.Try_with_resource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        /*
            try-with-resource(자동 리소스 관리라고도 함)은 Java 7에서 도입된 새로운 예외 처리 메커니즘으로,
            try-catch 블록 내에서 사용되는 리소스를 자동으로 닫음.
            이 기능을 사용하려면 try 괄호 안에 필요한 리소스를 선언 하면됨.
            생성된 리소스는 블록의 끝에서 자동으로 닫힘.
         */

        String path = "src/main/resources/sample_file/test2.txt"; //없는 파일명

        try(FileReader fileReader = new FileReader(path);){
            char[] chars = new char[50];
            fileReader.read(chars);
            for(char c: chars){
                System.out.print(c);
            }
            System.out.println();
        }catch (FileNotFoundException e){
            System.out.println("Exception: File not found!!!");
        } catch (IOException e) {
            System.out.println("Exception: I/O exception!!!");
        }
        System.out.println("Process finished");

    }
}
