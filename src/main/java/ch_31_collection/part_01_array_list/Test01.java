package ch_31_collection.part_01_array_list;
import java.util.ArrayList;


public class Test01 {
    public static void main(String[] args) {
        /*
            ArrayList : 배열에서 발전된 형태
            요소를 추가하면 0번 인덱스부터 차례대로 저장
            메서드를 사용해서 원하는 위치에 요소를 추가하거나, 삭제, 반환 할 수 있음
         */

        //제네릭으로 타입을 지정하지 않은 형태 ( Object 형식으로 저장하기 때문에 모든 타입을 저장할 수 있음)
        // 초기 capa 값을 지정할 수도 있음. 저장갯수에 근접하면 자동으로 capa가 늘어남.

        ArrayList<Object> list = new ArrayList<>(2);
        list.add("A");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(30);

        System.out.print("초기 상태: ");
        System.out.println(list);

        System.out.println("인덱스 1 위치에 B추가: ");
        list.add(1,  "B");
        System.out.println(list);
        System.out.println();

        System.out.println("remove index num 2");
        list.remove(2);
        System.out.println(list);
        System.out.println();

        System.out.println("Get index 2 value");
        System.out.println(list.get(2));
        System.out.println();





    }
}
