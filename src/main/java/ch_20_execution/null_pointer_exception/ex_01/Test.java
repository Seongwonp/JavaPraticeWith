package ch_20_execution.null_pointer_exception.ex_01;

//NULL 포인터 예외처리
public class Test {
    public static void main(String[] args) {
        int[] null_array = null;
        try{
            System.out.println(null_array.length);
            System.out.println("배열길이 출력완료"); //출력 안됨.
        }catch (NullPointerException e){
            System.out.println("Exception: The array is null!");
        }
    }
}
