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

    // Append element at end
    public void append(T data) {
        Node<T> newNode = new Node<>(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

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

        LinkedList<Integer> list = new LinkedList<>();

        // First create 56
        list.append(56);

        // Append 30 to 56
        list.append(30);

        // Append 70 to 30
        list.append(70);

        System.out.println("Linked List Sequence:");
        list.display();
    }
}