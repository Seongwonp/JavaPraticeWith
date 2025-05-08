package ch_31_collection.part_07_treeset.part_02;

import java.util.Comparator;

public class MyCompareInt implements Comparator<Integer> {
    /*
        compare(a,b)
        첫 번쨰 파라미터로 넘어온 객체 < 두 번째 파라미터로 넘어온 객체: 음수 리턴
        첫 번째 파라미터로 넘어온 객체 == 두 번째 파라미터로 넘어온 객체: 0 리턴
        첫 번째 파라미터로 넘어온 객체 > 두 번째 파라미터로 넘어온 객체: 양수 리턴
        음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두객체의 자리가 변경된다.
     */

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2) * -1; //Integer 클래스의 compareTo() 메서드를 반대로.
    }
}
