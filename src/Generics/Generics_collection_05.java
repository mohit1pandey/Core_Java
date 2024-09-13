package Generics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Generics_collection_05 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        LinkedList<Integer> list=new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);

        while (!q.isEmpty()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(q.poll());
        }

//        Deque
        Deque <Integer> dq= new ArrayDeque<>();
        dq.add(10);
        dq.addFirst(20);
        dq.addLast(30);
        System.out.println(dq);
        dq.poll();
        dq.pollLast();
        System.out.println(dq);

        /*  Queue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        pq.add(44);
        pq.add(50);
        pq.add(10);
        pq.add(27);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);*/
    }
}
