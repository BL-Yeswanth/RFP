package objectOriented.OopsConcept.EmployeeWage;

import java.util.Random;

/**
 * Employee Wage Computation Program
 * UC1: Check Employee Attendance
 * UC2: Calculate Daily Employee Wage
 * UC3: Add Part Time Employee & Wage
 * UC4: Solve using Switch Case Statement
 */
public class EmployeeWageComputation {

    // Constants
    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 8; // As per UC

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();
        int employeeCheck = random.nextInt(3);

        int workingHours;

        // UC4: Switch Case for attendance
        switch (employeeCheck) {

            case IS_FULL_TIME:
                System.out.println("Employee is Present - Full Time");
                workingHours = FULL_DAY_HOURS;
                break;

            case IS_PART_TIME:
                System.out.println("Employee is Present - Part Time");
                workingHours = PART_TIME_HOURS;
                break;

            default:
                System.out.println("Employee is Absent");
                workingHours = 0;
        }

        int dailyWage = workingHours * WAGE_PER_HOUR;
        System.out.println("Daily Employee Wage: " + dailyWage);
    }
}
