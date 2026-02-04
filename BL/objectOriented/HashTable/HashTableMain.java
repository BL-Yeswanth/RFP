package objectOriented.HashTable;

import java.util.LinkedList;
import java.util.Iterator;

public class HashTableMain {

    static class MyMapNode {
        String key;
        int value;

        MyMapNode(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    static class MyHashTable {
        private final int SIZE = 20;
        LinkedList<MyMapNode>[] buckets;

        @SuppressWarnings("unchecked")
        MyHashTable() {
            buckets = new LinkedList[SIZE];
            for (int i = 0; i < SIZE; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int getIndex(String key) {
            return Math.abs(key.hashCode()) % SIZE;
        }

        void add(String key) {
            int index = getIndex(key);

            for (MyMapNode node : buckets[index]) {
                if (node.key.equals(key)) {
                    node.value++;
                    return;
                }
            }
            buckets[index].add(new MyMapNode(key, 1));
        }

        void remove(String key) {
            int index = getIndex(key);
            Iterator<MyMapNode> iterator = buckets[index].iterator();

            while (iterator.hasNext()) {
                MyMapNode node = iterator.next();
                if (node.key.equals(key)) {
                    iterator.remove();
                    return;
                }
            }
        }

        void print() {
            for (LinkedList<MyMapNode> bucket : buckets) {
                for (MyMapNode node : bucket) {
                    System.out.println(node.key + " -> " + node.value);
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Hash Table Data Structure Problems using Java Generics");

        String paragraph =
                "Paranoids are not paranoid because they are paranoid but " +
                        "because they keep putting themselves deliberately into " +
                        "paranoid avoidable situations";

        String[] words = paragraph.toLowerCase().split(" ");

        MyHashTable hashTable = new MyHashTable();

        for (String word : words) {
            hashTable.add(word);
        }

        System.out.println("\nBefore Removing 'avoidable':");
        hashTable.print();

        hashTable.remove("avoidable");

        System.out.println("\nAfter Removing 'avoidable':");
        hashTable.print();
    }
}
