import java.util.*;

public class DataStructureSearch {

    public static void main(String[] args) {

        int size = 100000;

        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {

            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        int target = 99999;

        // Array Search
        long start1 = System.nanoTime();

        for (int num : array) {
            if (num == target) {
                break;
            }
        }

        long end1 = System.nanoTime();

        // HashSet Search
        long start2 = System.nanoTime();

        hashSet.contains(target);

        long end2 = System.nanoTime();

        // TreeSet Search
        long start3 = System.nanoTime();

        treeSet.contains(target);

        long end3 = System.nanoTime();

        System.out.println("Array Search Time: " + (end1 - start1) + " ns");
        System.out.println("HashSet Search Time: " + (end2 - start2) + " ns");
        System.out.println("TreeSet Search Time: " + (end3 - start3) + " ns");
    }
}