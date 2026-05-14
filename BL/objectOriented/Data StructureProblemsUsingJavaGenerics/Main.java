class Node<T extends Comparable<T>> {

    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class SortedLinkedList<T extends Comparable<T>> {

    Node<T> head;

    // Add elements in sorted order
    public void add(T data) {

        Node<T> newNode = new Node<>(data);

        // Insert at beginning
        if (head == null || data.compareTo(head.data) < 0) {

            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> temp = head;

        // Find correct position
        while (temp.next != null &&
               data.compareTo(temp.next.data) > 0) {

            temp = temp.next;
        }

        // Insert node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display Linked List
    public void display() {

        Node<T> temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        SortedLinkedList<Integer> list =
                new SortedLinkedList<>();

        // Add elements
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        System.out.println("Sorted Linked List:");
        list.display();
    }
}