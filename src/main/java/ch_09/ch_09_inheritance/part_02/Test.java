package ch_09.ch_09_inheritance.part_02;

public class Test {
    public static void main(String[] args) {
        Chick chick = new Chick();
        chick.display();
        GeneralChick chick2 = new GeneralChick();
        chick2.display();
        RedChick redChick = new RedChick();
        redChick.display();

        System.out.println(redChick.x);



    }
}
