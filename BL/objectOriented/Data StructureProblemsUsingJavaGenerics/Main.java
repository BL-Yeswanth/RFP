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

    // Add element at end
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
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

        // Adding elements
        list.add(56);
        list.add(30);
        list.add(70);

        // Display list
        System.out.println("Simple Linked List:");
        list.display();
    }
}