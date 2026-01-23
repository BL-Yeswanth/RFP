package Day6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CouponNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of distinct coupons: ");
        int n = sc.nextInt();

        Set<Integer> coupons = new HashSet<>();
        int count = 0;

        while (coupons.size() < n) {
            int random = (int)(Math.random() * n); // 0 to n-1
            count++;
            coupons.add(random); // Set ignores duplicates
        }

        System.out.println("Total random numbers needed = " + count);
    }
}

