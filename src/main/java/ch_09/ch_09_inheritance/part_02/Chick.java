package ch_09.ch_09_inheritance.part_02;

public class Chick {
    //부모 클래스
    public int x;
    public int y;

    public Chick(){
        this.x = 100;
        this.y = 100;
    }

    public void display(){
        System.out.println("병아리");
    }

    public void walk(){
        System.out.println("걷다");
    }

    public void ppick(){
        System.out.println("삑삑");
    }
}
