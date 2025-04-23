package ch_07_method;

public class My11 {

    static public int increase(int a){
        return ++a;
    }


    public static void main(String[] args) {
        int var1 = 100;
        int result = increase(var1);
        System.out.println("var1: " + var1 + ", result: " + result);
    }
}
