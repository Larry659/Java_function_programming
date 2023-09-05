package data_structure_and_algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_tutorial {
    public static void main(String[] args) {
        /*Queue like real life queue is a FIFO collection, i.e First In First Out*/
        //offer() this is to add object to the queue(enqueue)
        //poll() this is to remove object from the queue(dequeue)
        //peek() to view/examine the first object on the queue
        Queue<String> queue = new LinkedList<>();
        queue.offer("wale");
        queue.offer("lanre");
        queue.offer("kunle");
        queue.offer("lekan");
        System.out.println(queue.peek());
        //element() works the same way as peek() but the former throws exception.
      // queue.remove();does the same as poll() but throws exception once there is nothing to dequeue again
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
       // System.out.println(queue.poll());
        System.out.println(queue);
        //Queue also have methods it inherited from collection class.
    }
}
