package data_structure_and_algorithms;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_queue {
    public static void main(String[] args) {

        /*
        * PriorityQueue is a FIFO collection that serves element with higher priority first
        * before element with lower priority */
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        //you can decide to remove the Collections.reverseOrder() as to change the order.
        //you can try for String to test.
        queue.offer(3.0);
        queue.offer(5.5);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(3.5);
        System.out.println(queue);

     while(!queue.isEmpty())
          System.out.println(queue.poll());
//        int count = 0; int limit = 26;
//        while(limit >0){
//             count ++;
//            limit --;
//            System.out.println(count);
//        }


    }
}
