package objectOriented.DataStructure;

import java.util.LinkedList;


public class DataStructureApp<T> {

    // Queue implementation using LinkedList
    private LinkedList<T> queue;

    // Constructor
    public DataStructureApp() {
        queue = new LinkedList<>();
    }

    /**
     * Enqueue operation: add element to the end of the queue
     * @param element element to add
     */
    public void enqueue(T element) {
        queue.addLast(element);
        System.out.println("Enqueued: " + element);
    }

    /**
     * Dequeue operation: remove element from the beginning of the queue
     * @return element removed, or null if queue is empty
     */
    public T dequeue() {
        if (!queue.isEmpty()) {
            T removed = queue.removeFirst();
            System.out.println("Dequeued: " + removed);
            return removed;
        } else {
            System.out.println("Queue is empty, cannot dequeue.");
            return null;
        }
    }

    /**
     * Display current elements in the queue
     */
    public void displayQueue() {
        System.out.println("Current Queue: " + queue);
    }

    /**
     * Main method for demonstration
     */
    public static void main(String[] args) {

        System.out.println("Welcome to Data Structure Problems using Java Generics");

        // Using Integer Queue
        DataStructureApp<Integer> queueApp = new DataStructureApp<>();

        // UC2: Enqueue elements
        queueApp.enqueue(10);
        queueApp.enqueue(20);
        queueApp.enqueue(30);

        // Display Queue
        queueApp.displayQueue();  // Expected: [10, 20, 30]

        // UC4: Dequeue element from beginning
        queueApp.dequeue();       // Expected Dequeue: 10
        queueApp.displayQueue();  // Expected: [20, 30]
    }
}
