package objectOriented.OopsConcept.EmployeeWage;

import java.util.Random;

/**
 * Employee Wage Computation Program
 * UC1: Check Employee is Present or Absent
 */
public class EmployeeWageComputation {

    // Constants
    public static final int IS_PRESENT = 1;
    public static final int IS_ABSENT = 0;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();
        int attendance = random.nextInt(2);

        if (attendance == IS_PRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
