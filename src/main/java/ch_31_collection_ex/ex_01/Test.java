package ch_31_collection_ex.ex_01;

import java.util.*;

/*
문자열을 저장할 수 있는 ArrayList 객체를 생성하고
여기에 "a", "b", "c", "d", "e"를 저장한 후
이것을 출력하는 프로그램을 작성해 보자.
출력 예:
[a, b, c, d, e]
 */
public class Test {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        for(char i = 'a' ; i<='e' ; i++){
            list.add(i);
        }

        System.out.println(list);
    }
}
