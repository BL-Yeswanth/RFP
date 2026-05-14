class MyMapNode<K, V> {

    K key;
    V value;
    MyMapNode<K, V> next;

    MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class MyLinkedList<K, V> {

    MyMapNode<K, V> head;

    // Add or update node
    public void add(K key, V value) {

        MyMapNode<K, V> temp = head;

        while (temp != null) {

            // Update existing key
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }

            temp = temp.next;
        }

        // Add new node
        MyMapNode<K, V> newNode =
                new MyMapNode<>(key, value);

        newNode.next = head;
        head = newNode;
    }

    // Get value using key
    public V get(K key) {

        MyMapNode<K, V> temp = head;

        while (temp != null) {

            if (temp.key.equals(key)) {
                return temp.value;
            }

            temp = temp.next;
        }

        return null;
    }

    // Remove node using key
    public void remove(K key) {

        // If list is empty
        if (head == null) {
            return;
        }

        // If head node contains key
        if (head.key.equals(key)) {
            head = head.next;
            return;
        }

        MyMapNode<K, V> temp = head;

        while (temp.next != null) {

            if (temp.next.key.equals(key)) {

                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }
    }

    // Display Linked List
    public void display() {

        MyMapNode<K, V> temp = head;

        while (temp != null) {

            System.out.println(
                    temp.key + " : " + temp.value
            );

            temp = temp.next;
        }
    }
}

class MyHashTable<K, V> {

    int size;
    MyLinkedList<K, V>[] table;

    MyHashTable(int size) {

        this.size = size;

        table = new MyLinkedList[size];

        // Initialize LinkedList for each index
        for (int i = 0; i < size; i++) {
            table[i] = new MyLinkedList<>();
        }
    }

    // Generate index using hashcode
    private int getIndex(K key) {

        return Math.abs(key.hashCode()) % size;
    }

    // Add key-value pair
    public void add(K key, V value) {

        int index = getIndex(key);

        table[index].add(key, value);
    }

    // Get value using key
    public V get(K key) {

        int index = getIndex(key);

        return table[index].get(key);
    }

    // Remove word using key
    public void remove(K key) {

        int index = getIndex(key);

        table[index].remove(key);
    }

    // Display Hash Table
    public void display() {

        for (int i = 0; i < size; i++) {

            if (table[i].head != null) {

                System.out.println(
                        "Index " + i + ":"
                );

                table[i].display();

                System.out.println();
            }
        }
    }
}

public class WordFrequencyApp {

    public static void main(String[] args) {

        String paragraph =
                "Paranoids are not paranoid because they are paranoid " +
                "but because they keep putting themselves deliberately " +
                "into paranoid avoidable situations";

        paragraph = paragraph.toLowerCase();

        String[] words = paragraph.split(" ");

        MyHashTable<String, Integer> hashTable =
                new MyHashTable<>(10);

        // Count frequency
        for (String word : words) {

            Integer count = hashTable.get(word);

            if (count == null) {
                hashTable.add(word, 1);
            } else {
                hashTable.add(word, count + 1);
            }
        }

        System.out.println("Before Removing 'avoidable':\n");

        hashTable.display();

        // Remove avoidable word
        hashTable.remove("avoidable");

        System.out.println(
                "After Removing 'avoidable':\n"
        );

        hashTable.display();
    }
}