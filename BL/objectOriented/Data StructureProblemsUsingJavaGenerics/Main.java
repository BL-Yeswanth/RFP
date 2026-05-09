class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    Node<T> head;

    // Add element at beginning
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        head = newNode;
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

        LinkedList<Integer> list = new LinkedList<>();

        // First create 70
        list.addFirst(70);

        // Add 30 before 70
        list.addFirst(30);

        // Add 56 before 30
        list.addFirst(56);

        System.out.println("Linked List Sequence:");
        list.display();
    }
}