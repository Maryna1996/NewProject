package example.lesson14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queueLinkedList = new LinkedList<>();

        queueLinkedList.add(1);
        queueLinkedList.add(2);
        queueLinkedList.add(3);

        System.out.println(queueLinkedList);
        queueLinkedList.poll();
        System.out.println(queueLinkedList);

        Deque<Integer> dequeLinkedList = new LinkedList<>();

        dequeLinkedList.add(1);
        dequeLinkedList.add(2);
        dequeLinkedList.add(3);

        dequeLinkedList.pollLast();

        Queue<Integer> priorityQueue = new PriorityQueue<>(Integer::compare);

        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(4);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }
}
