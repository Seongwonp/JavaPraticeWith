package ch_20_execution.File_Not_Found_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//finally 예
//DB나 파일의 경우 사용후에는 닫아줘야 함.(close() 실행)
public class Test {
    public static void main(String[] args) {
        String path = "src/main/resources/sample_file/test.txt";
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(path);
            System.out.println("file path is " + path);
        }catch (FileNotFoundException e){
            System.out.println("Exception: file not found");
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("error closing file");
                }
            }
        }
        System.out.println("Test End");

    }
}
