package ch_31_collection.part_05_Queue.part_01;

import java.util.LinkedList;

public class MyQueue {
    private final LinkedList<String> queue;
    public MyQueue() {
        queue = new LinkedList<>();
    }
    public void enqueue(String string) {
        queue.add(string);
    }

    public String dequeue() {
        return (queue.isEmpty())? "NULL" : queue.removeFirst();
    }

    public void printQueue() {
        if (queue.isEmpty()){
            System.out.println("Queue is empty!!");
            return;
        }
        System.out.println(queue);
    }


}
