package objectOriented.OopsConcept.EmployeeWage;

import java.util.Random;

/**
 * Employee Wage Computation Program
 * UC1: Check Employee Attendance
 * UC2: Calculate Daily Employee Wage
 */
public class EmployeeWageComputation {

    // Constants
    public static final int IS_PRESENT = 1;
    public static final int IS_ABSENT = 0;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();
        int attendance = random.nextInt(2);

        int dailyWage = 0;

        if (attendance == IS_PRESENT) {
            System.out.println("Employee is Present");
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
        } else {
            System.out.println("Employee is Absent");
            dailyWage = 0;
        }

        System.out.println("Daily Employee Wage: " + dailyWage);
    }
}
