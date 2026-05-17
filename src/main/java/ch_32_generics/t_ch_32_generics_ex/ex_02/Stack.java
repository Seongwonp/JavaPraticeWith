package ch_32_generics.t_ch_32_generics_ex.ex_02;

import java.util.ArrayList;

// 연습: 제네릭으로 구현한 Stack<T>
public class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() { return list.isEmpty(); }
    public int size() { return list.size(); }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("첫번째");
        stack.push("두번째");
        stack.push("세번째");

        System.out.println("peek: " + stack.peek());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("size: " + stack.size());
    }
}
