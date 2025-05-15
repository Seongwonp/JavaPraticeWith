package ch_20_execution.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//다향성을 이용한 예외처리
public class Test {
    public static void main(String[] args) {
        String path = "src/main/resources/sample_file/test2.txt";
        FileInputStream fileInputStream = null;

        try{
            fileInputStream = new FileInputStream(path);
            System.out.println("Open file successfully");
        } catch (FileNotFoundException e){
            System.out.println("*** FileNotFoundException ***");
        } catch (Exception e){ //FileNotFoundException 을 제외한 모든 예외는 여기서 처리
            System.out.println("*** Exception ***");
            e.printStackTrace();
        } finally{
            if(fileInputStream != null){
                try{
                    fileInputStream.close();
                }catch (IOException e){
                    System.out.println("*** I/IIOException ***");
                    throw new RuntimeException(e);
                }
                System.out.println("FileInputStream closed");
            }
        }
    }
}
