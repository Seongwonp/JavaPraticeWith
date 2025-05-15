package ch_20_execution.null_pointer_exception.ex_02;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {10,20,30};

        try{
            System.out.println("numbers[2] = " + numbers[2]);
            System.out.println("numbers[3] = " + numbers[3]);
            System.out.println("End of test");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Index out of bounds!!!");
        }


    }
}
