package ch_10_abstract.part_02;

public class Test {
    public static void main(String[] args) {
//        AbsParent absParent = new AbsParent();
        AbsParent absParent = new MyChild();
        absParent.show();
        absParent.absShow();


    }
}
