package objectOriented.DataStructure;

import java.util.LinkedList;


public class DataStructureApp {

    // Generic Stack implemented using LinkedList
    static class Stack<T> {
        private LinkedList<T> list = new LinkedList<>();

        // Push element to top of stack
        public void push(T data) {
            list.addFirst(data);
            System.out.println(data + " pushed to stack");
        }

        // Pop element from top of stack
        public T pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return null;
            }
            T data = list.removeFirst();
            System.out.println(data + " popped from stack");
            return data;
        }

        // Peek element at top of stack
        public T peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return null;
            }
            return list.getFirst();
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return list.isEmpty();
        }

        // Print current stack
        public void printStack() {
            System.out.println("Current Stack: " + list);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Data Structure Problems using Java Generics");

        // Create stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements as per UC2 sequence: 56, 30, 70
        stack.push(56);
        stack.push(30);
        stack.push(70);

        stack.printStack(); // Prints initial stack

        // Peek top element
        System.out.println("Top element is: " + stack.peek());

        // Pop all elements till stack is empty
        while (!stack.isEmpty()) {
            stack.pop();
        }

        stack.printStack(); // Should be empty now
    }
}
