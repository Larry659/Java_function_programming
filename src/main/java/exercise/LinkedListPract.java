package exercise;

import java.util.LinkedList;

public class LinkedListPract {
    public  static void main(String [] arg){
        /*LinkedList implements the java.utils.List interface, and it also implements the QUEUE and STACK*/
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("paris");
        placesToVisit.add("melbourne");
        addPlacesToList(placesToVisit);

        //QUEUE method
        placesToVisit.offer("cairo");
        placesToVisit.offerFirst("califonia");
        placesToVisit.offerLast("kigali");

        //STACK method
        placesToVisit.push("ottawa");
        System.out.println(placesToVisit);// this adds to the last
        printPlaces(placesToVisit);
    }
    public static void addPlacesToList(LinkedList<String> list){
        list.addFirst("Amsterdam");
        list.addLast("New york");
    }
    public static void printPlaces(LinkedList<String> list){
       var iterator = list.listIterator();
        var iterator2 = list.listIterator(3);// thhis iteration starts from index 3
/*
*  both forward and backward iteration
* it also supports add and set method*/
       while(iterator.hasNext()){
           if (iterator.next().equalsIgnoreCase("ottawa")){
               iterator.remove();
           }
           System.out.println(iterator.next());
       }
    }
}
