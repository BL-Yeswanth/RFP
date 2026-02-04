package objectOriented.HashTable;

import java.util.LinkedList;

public class HashTableMain {

    // Node for Key-Value pair
    static class MyMapNode {
        String key;
        int value;

        MyMapNode(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Hash Table using LinkedList
    static class MyHashTable {
        private final int SIZE = 10;
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

        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");

        MyHashTable hashTable = new MyHashTable();

        for (String word : words) {
            hashTable.add(word);
        }

        System.out.println("\nWord Frequency:");
        hashTable.print();
    }
}
