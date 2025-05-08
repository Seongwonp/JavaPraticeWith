package ch_31_collection.part_04_stack.part_01;

import java.util.*;

/*
    -List를 이용하여 stack 자료구조 구현
     * stack을 구현할 때 ArrayList, LinkedList 중 어느 것ㅇ르 선택하는 것이 좋을까? : ArrayList
    push(E Item): 주어진 객체를 스택에 넣음.
    peek(): 스택의 맨위 객체를 가져옴. 객체를 스택에서 제거하지 않음.
    pop(): 스택의 맨 위 객체를 가져옴. 객체를 스택에서 제거.
 */
public class MyStack {
    private final List<String> stack = new ArrayList<>();

    public void push(String item) {
        stack.add(item);
    }
    public String peek() {
        if (stack.isEmpty()) return "Is Empty!";
        return"peek: " +  stack.get(stack.size() - 1);
    }
    public String pop() {
        if (stack.isEmpty()) return "Is Empty!";
        return"pop: " +  stack.remove(stack.size() - 1);
    }

    public void list(){
        if(stack.isEmpty()){
            System.out.println("NULL");
            return;
        }
        System.out.println(stack);
    }
}
