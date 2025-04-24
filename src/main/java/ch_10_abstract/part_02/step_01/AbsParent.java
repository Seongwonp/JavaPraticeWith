package ch_10_abstract.part_02.step_01;

abstract public class AbsParent {
    protected String name = "AbsParent";

    public void show(){
        System.out.println(name);
    }

    public abstract void absShow();
}
