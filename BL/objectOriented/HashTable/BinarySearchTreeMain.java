package objectOriented.HashTable;

public class BinarySearchTreeMain {

    interface INode<K extends Comparable<K>> {
        K getKey();
        void setLeft(INode<K> left);
        void setRight(INode<K> right);
        INode<K> getLeft();
        INode<K> getRight();
    }

    static class MyBinaryNode<K extends Comparable<K>> implements INode<K> {
        private K key;
        private INode<K> left;
        private INode<K> right;

        MyBinaryNode(K key) {
            this.key = key;
        }

        public K getKey() {
            return key;
        }

        public void setLeft(INode<K> left) {
            this.left = left;
        }

        public void setRight(INode<K> right) {
            this.right = right;
        }

        public INode<K> getLeft() {
            return left;
        }

        public INode<K> getRight() {
            return right;
        }
    }

    static class BinarySearchTree<K extends Comparable<K>> {
        private INode<K> root;

        public void add(K key) {
            root = addRecursively(root, key);
        }

        private INode<K> addRecursively(INode<K> current, K key) {
            if (current == null)
                return new MyBinaryNode<>(key);

            if (key.compareTo(current.getKey()) < 0)
                current.setLeft(addRecursively(current.getLeft(), key));
            else if (key.compareTo(current.getKey()) > 0)
                current.setRight(addRecursively(current.getRight(), key));

            return current;
        }

        public int size() {
            return sizeRecursively(root);
        }

        private int sizeRecursively(INode<K> node) {
            if (node == null)
                return 0;
            return 1 + sizeRecursively(node.getLeft()) + sizeRecursively(node.getRight());
        }

        public INode<K> getRoot() {
            return root;
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Binary Search Tree (BST) Problems");

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);

        System.out.println("Total Nodes in BST : " + bst.size());
    }
}
