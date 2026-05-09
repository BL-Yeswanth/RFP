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

    // Append node at end
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

    // Insert node after specific value
    public void insertAfter(T previousData, T newData) {

        Node<T> temp = head;

        while (temp != null) {

            if (temp.data.equals(previousData)) {

                Node<T> newNode = new Node<>(newData);

                newNode.next = temp.next;
                temp.next = newNode;

                return;
            }

            temp = temp.next;
        }
    }

    // Display linked list
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

        // Create initial list
        list.append(56);
        list.append(70);

        // Insert 30 between 56 and 70
        list.insertAfter(56, 30);

        System.out.println("Final Sequence:");
        list.display();
    }
}