package objectOriented.DataStructure;

/**
 * UC5: Delete the first element in the LinkedList
 * Initial Sequence: 56 -> 30 -> 70
 * Final Sequence: 30 -> 70
 */
public class DataStructureMain {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of Linked List
    static Node head;

    /**
     * Pop method deletes the first element of the Linked List
     */
    public static void pop() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        head = head.next; // Move head to next node
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Data Structure Problems using Java Generics");

        // Create Linked List: 56 -> 30 -> 70
        head = new Node(56);
        head.next = new Node(30);
        head.next.next = new Node(70);

        System.out.print("Before Pop: ");
        printList();

        // Delete first element
        pop();

        System.out.print("After Pop: ");
        printList();
    }

    /**
     * Print Linked List
     */
    public static void printList() {
        Node current = head;
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
