package ch_31_collection.part_05_Queue.part_01;

public class Test {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue("a");
        myQueue.enqueue("b");
        myQueue.enqueue("c");
        myQueue.printQueue();
        myQueue.enqueue("d");
        myQueue.enqueue("e");
        myQueue.printQueue();

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        myQueue.printQueue();
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        myQueue.printQueue();

    }
}
