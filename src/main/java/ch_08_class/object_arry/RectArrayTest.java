package ch_08_class.object_arry;

public class RectArrayTest {
    public static void main(String[] args) {
        Rect[] list;
        list = new Rect[5];

        for(int i = 0; i <list.length; i++) {
            list[i] = new Rect(i+1,i+1);
        }

        for(int i = 0; i <list.length; i++) {
            System.out.println(i+1+"번째 사각형의 면적 = "+list[i].getArea());
        }

    }
}
