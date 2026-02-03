package objectOriented.DataStructure;

/**
 * UC6: Delete the last element in the LinkedList
 * Initial Sequence: 56 -> 30 -> 70
 * Final Sequence: 56 -> 30
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
     * popLast method deletes the last element of the Linked List
     */
    public static void popLast() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        // If only one element exists
        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        // Traverse to second last node
        while (current.next.next != null) {
            current = current.next;
        }

        // Remove last node
        current.next = null;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Data Structure Problems using Java Generics");

        // Create Linked List: 56 -> 30 -> 70
        head = new Node(56);
        head.next = new Node(30);
        head.next.next = new Node(70);

        System.out.print("Before popLast: ");
        printList();

        // Delete last element
        popLast();

        System.out.print("After popLast: ");
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
