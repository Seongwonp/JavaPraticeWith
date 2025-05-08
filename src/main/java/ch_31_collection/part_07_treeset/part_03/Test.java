package ch_31_collection.part_07_treeset.part_03;

import java.util.*;
/*
정렬을 변경하는 방법.

1. Comparable 인터페이스 구현
정렬을 구현하는 데 사용하는 인터페이스이고 compareTo() 메서드를 구현해야 함.
첫 번째 매개변수가 더 클때 양수를 반환하여 오름차순으로 정렬.

a.compareTo(b) :
현재 객체 < 파라미터로 넘어온 객체: 음수 리턴
현재 객체 == 파라미터로 넘어온 객체: 0 리턴
현재 객체 > 파라미터로 넘어온 객체: 양수 리턴
음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다.

2. Comparator 인터페이스 구현
정렬을 구현하는 데 사용하는 인터페이스이고 compare() 메서드를 구현해야 함.
compareTo() 메서드는 this와 전달된 매개변수를 비교하였다면, compare() 메서드는 전달되는 두 매개변수를 비교.
compare() 메서드에는 매개변수가 2개 전달.

compare(a, b)
첫 번째 파라미터로 넘어온 객체 < 두 번째 파라미터로 넘어온 객체: 음수 리턴
첫 번째 파라미터로 넘어온 객체 == 두 번째 파라미터로 넘어온 객체: 0 리턴
첫 번째 파라미터로 넘어온 객체 > 두 번째 파라미터로 넘어온 객체: 양수 리턴
음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 변경된다.


일반적으로 Comparator 인터페이스 보다는 Comparable 인터페이스를 더 많이 사용.
다만 어떤 클래스가 이미 Comparable 인터페이스를 구현한 경우에 이 클래스의 정렬 방식을 정의할 때 Comparator 인터페이스를 사용.
String 클래스가 Comparable 인터페이스를 구현했고, compareTo() 메서드는 오름차순을 구현.
*/

public class Test {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
            }
        });  //DESC로 변경

        strings.add("aaa");
        strings.add("ccc");
        strings.add("bbb");

        System.out.println(strings);

    }
}
