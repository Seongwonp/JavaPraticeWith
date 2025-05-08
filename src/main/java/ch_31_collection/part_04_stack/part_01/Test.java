package ch_31_collection.part_04_stack.part_01;

public class Test {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.list();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.list();
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("\n");

        //오른쪽 push
        MyStack_02 stack2 = new MyStack_02();
        stack2.push("a");
        stack2.push("b");
        stack2.list();
        stack2.push("c");
        stack2.push("d");
        stack2.push("e");
        stack2.list();
        System.out.println(stack2.peek());
        stack2.list();
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        stack2.list();
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());




    }
}
