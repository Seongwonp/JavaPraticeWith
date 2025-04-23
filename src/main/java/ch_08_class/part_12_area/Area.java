package ch_08_class.part_12_area;

public class Area {

    //static 이 있으므로 클래스 메서드
    static void manual(){
        System.out.println("현재 사용 가능한 함수 목록");
        System.out.println("triangle(): 삼각형 넓이");
        System.out.println("rectangle(): 사각형 넓이");
        System.out.println("입니다.");
    }


    double triangle(int width, int height){
        /* 삼각형 넓이 */
        return (double) width * height / 2;
    }

    int rectangle(int width, int height){
        /* 사각형 넓이 */
        return width * height;
    }

}
