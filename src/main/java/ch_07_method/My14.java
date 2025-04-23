package ch_07_method;

public class My14 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었음.");
        firstMethod();
        System.out.println("main(String[] args)이 끝났음");
    }

    static void firstMethod(){
        System.out.println("First Method Started");
        secondMethod();
        System.out.println("First Method Ended");
    }

    static void secondMethod(){
        System.out.println("Second Method Started");
        System.out.println("Second Method Ended");
    }
}
