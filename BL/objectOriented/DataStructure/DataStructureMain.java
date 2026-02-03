package objectOriented.DataStructure;

/**
 * UC7: Search LinkedList to find node with value 30
 */
public class DataStructureMain {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    // Search method
    public static boolean search(int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Manual test method (instead of JUnit)
    public static void testSearch() {

        head = new Node(56);
        head.next = new Node(30);
        head.next.next = new Node(70);

        boolean result = search(30);

        if (result) {
            System.out.println("TEST PASSED: Node with value 30 found");
        } else {
            System.out.println("TEST FAILED: Node with value 30 not found");
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Data Structure Problems using Java Generics");

        testSearch();
    }
}
