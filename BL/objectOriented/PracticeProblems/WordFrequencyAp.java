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

    // Add or update word frequency
    public void add(K key, V value) {

        MyMapNode<K, V> temp = head;

        // Check if key already exists
        while (temp != null) {

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

public class WordFrequencyApp {

    public static void main(String[] args) {

        String sentence = "To be or not to be";

        sentence = sentence.toLowerCase();

        String[] words = sentence.split(" ");

        MyLinkedList<String, Integer> list =
                new MyLinkedList<>();

        // Count frequency
        for (String word : words) {

            Integer count = list.get(word);

            if (count == null) {
                list.add(word, 1);
            } else {
                list.add(word, count + 1);
            }
        }

        System.out.println("Word Frequencies:");

        list.display();
    }
}