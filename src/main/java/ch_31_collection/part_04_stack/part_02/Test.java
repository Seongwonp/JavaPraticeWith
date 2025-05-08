package ch_31_collection.part_04_stack.part_02;

import java.util.*;

/*
    Stack을 이용한 동전 케이스

 */
public class Test {
    public static void main(String[] args) {
        Stack<Coin> coins = new Stack<>();
        coins.push(new Coin(100));
        coins.push(new Coin(50));
        coins.push(new Coin(500));
        coins.push(new Coin(10));

        while(!coins.isEmpty()) {
            Coin coin = coins.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "₩");
        }
    }


}
