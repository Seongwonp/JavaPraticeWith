package ch_08_class.part_13_check;

public class Check {
    /*

       핵심!!!: cm에서 im에 접근할 수 없음

        iv: instanceVariable
        cv: classVariable
        im: instanceMethod
        cm: classMethod
     */

    static int cv = 5;
    int iv = 4;

    static void cm(){
        System.out.println("ClassMethod");
    }

    void im(){
        System.out.println("InstanceMethod");
    }



}
