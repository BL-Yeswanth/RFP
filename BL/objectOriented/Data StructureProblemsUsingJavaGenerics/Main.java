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

    // Pop first element
    public void pop() {

        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        head = head.next;
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

        System.out.println("Before Pop:");
        list.display();

        // Delete first element
        list.pop();

        System.out.println("After Pop:");
        list.display();
    }
}