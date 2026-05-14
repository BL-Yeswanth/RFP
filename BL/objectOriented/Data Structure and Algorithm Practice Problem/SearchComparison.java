import java.util.Arrays;

public class SearchComparison {

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int size = 100000;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        int target = 99999;

        long start1 = System.nanoTime();
        linearSearch(arr, target);
        long end1 = System.nanoTime();

        Arrays.sort(arr);

        long start2 = System.nanoTime();
        binarySearch(arr, target);
        long end2 = System.nanoTime();

        System.out.println("Linear Search Time: " + (end1 - start1) + " ns");
        System.out.println("Binary Search Time: " + (end2 - start2) + " ns");
    }
}