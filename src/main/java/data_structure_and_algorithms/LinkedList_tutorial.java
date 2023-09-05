package data_structure_and_algorithms;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_tutorial {
    public static void main(String[] args) {
        /*LinkedList can be treated as a queue and also as a stack.
        * LinkedList more of advantage over arraylist because it stores data in a non-sequential pattern
        * which makes it easy to remove or add elements
        * Its disadvantage compared to arraylist is that, it uses more memory */

        LinkedList<String> grade = new LinkedList<>();
//        //As a stack
//        grade.push("A");
//        grade.push("B");
//        grade.push("C");
//        grade.push("D");
//        grade.push("E");
//        grade.pop();
//        System.out.println(grade);
    //As a queue
        grade.offer("A");
        grade.offer("B");
        grade.offer("C");
        grade.offer("D");
        grade.offer("E");
        grade.poll();
       System.out.println(grade);
    }
}
