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

    // Append elements
    public void append(T data) {

        Node<T> newNode = new Node<>(data);

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

    // Search node
    public boolean search(T key) {

        Node<T> temp = head;

        while (temp != null) {

            if (temp.data.equals(key)) {
                return true;
            }

            temp = temp.next;
        }

        return false;
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

        // Create Linked List
        list.append(56);
        list.append(30);
        list.append(70);

        list.display();

        // Search element
        if (list.search(30)) {
            System.out.println("Node with value 30 found");
        } else {
            System.out.println("Node not found");
        }
    }
}