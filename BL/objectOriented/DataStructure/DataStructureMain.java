package objectOriented.DataStructure;

/**
 * UC3: Create Linked List by appending 30 and 70 to 56
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

        // Step 1: Create first node with data 56
        Node head = new Node(56);

        // Step 2: Append 30
        Node secondNode = new Node(30);
        head.next = secondNode;

        // Step 3: Append 70
        Node thirdNode = new Node(70);
        secondNode.next = thirdNode;

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
