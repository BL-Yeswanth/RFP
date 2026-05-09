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

    // Delete node by value
    public void delete(T key) {

        // If list is empty
        if (head == null) {
            return;
        }

        // If head node contains key
        if (head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node<T> temp = head;

        while (temp.next != null) {

            if (temp.next.data.equals(key)) {

                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }
    }

    // Size of Linked List
    public int size() {

        int count = 0;

        Node<T> temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
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
        list.append(40);
        list.append(70);

        System.out.println("Before Deletion:");
        list.display();

        // Delete node 40
        list.delete(40);

        System.out.println("After Deletion:");
        list.display();

        // Display size
        System.out.println("Size of Linked List: " + list.size());
    }
}