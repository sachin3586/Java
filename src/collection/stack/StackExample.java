package collection.stack;

import java.util.Stack;

public class StackExample {    // It follow LIFO data structure
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push("Sachin");       // To add data in stack
        stack.add(500);
        stack.add("Shlok");

        System.out.println(stack.search("Sachin")); // Stack index starting from 1
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());  // Return top element i.e last added element
        System.out.println(stack.pop());  // remove top element and return it
        System.out.println(stack);
    }
}
