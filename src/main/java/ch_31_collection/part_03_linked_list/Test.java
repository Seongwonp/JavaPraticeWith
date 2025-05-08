package ch_31_collection.part_03_linked_list;
import java.util.*;
public class Test {
    public static void main(String[] args) {
//        List<String>linkedList = new LinkedList<>();
        LinkedList<String> linkedList = new LinkedList<>(); //-> addFirst/Last() , removeFirst/Last() 등을 사용하기위해 LinkedList 로선언
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println(linkedList);

        linkedList.add(1,"D");
        System.out.println(linkedList);

        //addFirst() 사용  -> LinkedList 에만 존제!!!
        linkedList.addFirst("E");
        System.out.println(linkedList);

        //removeLast() -> LinkedList 에만 존재!
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
