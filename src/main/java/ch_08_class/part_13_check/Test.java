package ch_08_class.part_13_check;

public class Test {
    public static void main(String[] args) {
        Check c = new Check();
        System.out.println("InstanceValue: " + c.iv);
        System.out.println("ClassValue: " + Check.cv);
        c.im();
        Check.cm();
    }
}
