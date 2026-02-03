package objectOriented.DataStructure;

/**
 * UC1: Create a simple Linked List with elements 56, 30, 70
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

        // Creating nodes
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);

        // Linking nodes: 56 -> 30 -> 70
        firstNode.next = secondNode;
        secondNode.next = thirdNode;

        // Print Linked List
        System.out.print("Linked List: ");
        Node current = firstNode;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
    }
}
