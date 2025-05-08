package ch_31_collection.part_04_stack.part_01;

import java.util.ArrayList;
import java.util.List;

public class MyStack_02 {

    private final List<String> stack = new ArrayList<>();

    public void push(String item) {
        System.out.println("Push: " + item);
        stack.add(0, item);
    }
    public String peek() {
        if (stack.isEmpty()) return "Is Empty!";
        return "peek: " + stack.get(0);
    }
    public String pop() {
        if (stack.isEmpty()) return "Is Empty!";
        return "pop: " + stack.remove(0);
    }

    public void list(){
        if(stack.isEmpty()){
            System.out.println("NULL");
            return;
        }
        System.out.println(stack);
    }
}
