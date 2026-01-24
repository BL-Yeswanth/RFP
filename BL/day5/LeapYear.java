package day5;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        boolean leap = false;
        Scanner sc = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check 4-digit year
        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a valid 4-digit year.");
            return;
        }

        // Leap year logic
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    leap = true;
                }
                else {
                    leap = false;
                }
            }
            else{
                leap = true;
            }

        }
        if(leap){
            System.out.println("leap year");
        }
        else{
            System.out.println("Not a Leap year");}

    }
}
