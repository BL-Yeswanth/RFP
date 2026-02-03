package objectOriented.DataStructure;

/**
 * UC1: Ability to create a Stack of 56->30->70
 * Using LinkedList
 */
public class DataStructureApp {

    // Generic Stack using LinkedList
    static class Stack<T> {

        // Node class
        private class Node {
            T data;
            Node next;

            Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node top;

        /**
         * Push operation (adds element to top of stack)
         * Internally uses LinkedList add (addFirst)
         */
        public void push(T data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        /**
         * Display stack elements
         */
        public void printStack() {
            Node current = top;
            System.out.print("Stack (Top -> Bottom): ");
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) {
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Data Structure Problems using Java Generics");

        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Display stack
        stack.printStack();
    }
}
