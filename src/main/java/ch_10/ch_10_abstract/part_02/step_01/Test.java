package ch_10.ch_10_abstract.part_02.step_01;

public class Test {
    public static void main(String[] args) {
//        AbsParent absParent = new AbsParent();
        AbsParent absParent = new MyChild();
        absParent.show();
        absParent.absShow();


    }
}
