package ch_09.ch_09_inheritance.part_07;

public class Point {
    /*2차원의 위치를 저장하는 클래스*/
    public int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String getLocation(){
        return "x: " + x+", y: "+y;
    }
}
