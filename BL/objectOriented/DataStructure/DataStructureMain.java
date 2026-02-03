package objectOriented.DataStructure;

/**
 * UC2: Create Linked List by adding 30 and 56 to 70
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

        // Step 1: Create first node with data 70
        Node head = new Node(70);

        // Step 2: Add 30 to the beginning
        Node secondNode = new Node(30);
        secondNode.next = head;
        head = secondNode;

        // Step 3: Add 56 to the beginning
        Node thirdNode = new Node(56);
        thirdNode.next = head;
        head = thirdNode;

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
