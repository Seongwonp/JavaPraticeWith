package ch_08_class.object_arry;

public class Rect {
    private int width, height;

    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }
    public double getArea() {return (double)width * height;}
}
