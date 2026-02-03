package objectOriented.DataStructure;

/**
 * UC4: Insert 30 between 56 and 70
 * Final Sequence: 56 -> 30 -> 70
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

    public static void main(String[] args) {

        System.out.println("Welcome to Data Structure Problems using Java Generics");

        // Step 1: Create Linked List: 56 -> 70
        Node head = new Node(56);
        Node lastNode = new Node(70);
        head.next = lastNode;

        // Step 2: Insert 30 between 56 and 70
        Node newNode = new Node(30);
        newNode.next = head.next;
        head.next = newNode;

        // Print Linked List
        System.out.print("Linked List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
    }
}
