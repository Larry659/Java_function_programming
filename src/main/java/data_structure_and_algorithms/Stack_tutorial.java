package data_structure_and_algorithms;

import java.util.Stack;

public class Stack_tutorial {
    public static void main(String[] args) {
        //stack = LIFO data structure. Last in First out
        //stores data in sort of vertical tower
        //push() to add to the top
        //pop() to remove from the top
        //search() to search for an object, returns the position of the object from top to bottom
        //peek() this returns the topmost object from the stack
        //empty() this checks if the stack is empty or not
        Stack<String> stack = new Stack<String>();
        stack.push("ababio");
        stack.push("okeke");
        stack.push("essential-biology");
       // stack.pop();// removes from the top
        stack.add("elementary-phy");// push() and add() perform the same function.
        System.out.println("The search for a book:" + stack.search("okeke"));//returns the index of the from top to buttom
        //Note: not an index zero.
        System.out.println("the capacity is : " + stack.capacity());

        System.out.println(stack.empty());
       // System.out.println(stack.pop());
        System.out.println("The topmost value is :" + stack.peek());
        System.out.println(stack);

    }

}
