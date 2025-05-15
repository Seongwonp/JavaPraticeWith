package ch_11.step_01;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    //인터페이스에 디폴드 메소드 구현
    default void description(){
        System.out.println("Looking for an integer calculator.");
        myMethod(); // default 메소드 기능분리를 위해 사용
    }

    //private 메소드 구현
    private void myMethod(){
        System.out.println("This is private Method");
    }

    //static 메소드 구현
    static int total(int[] arr){
        myStaticMethod();
        int total = 0;

        for(int i: arr){
            total += i;
        }
        return total;
    }


    private static void myStaticMethod(){
        System.out.println("This is private static method");
    }

}
