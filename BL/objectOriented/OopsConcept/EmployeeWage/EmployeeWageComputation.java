package objectOriented.OopsConcept.EmployeeWage;

import java.util.Random;

/**
 * Employee Wage Computation Program
 * UC1: Check Employee Attendance
 * UC2: Calculate Daily Employee Wage
 * UC3: Add Part Time Employee & Wage
 * UC4: Solve using Switch Case Statement
 * UC5: Calculate Wages for a Month
 */
public class EmployeeWageComputation {

    // Constants
    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 8; // As per UC
    public static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();
        int totalMonthlyWage = 0;

        // UC5: Calculate wage for 20 working days
        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {

            int employeeCheck = random.nextInt(3);
            int workingHours;

            switch (employeeCheck) {

                case IS_FULL_TIME:
                    workingHours = FULL_DAY_HOURS;
                    break;

                case IS_PART_TIME:
                    workingHours = PART_TIME_HOURS;
                    break;

                default:
                    workingHours = 0;
            }

            int dailyWage = workingHours * WAGE_PER_HOUR;
            totalMonthlyWage += dailyWage;

            System.out.println("Day " + day + " Wage: " + dailyWage);
        }

        System.out.println("\nTotal Monthly Wage: " + totalMonthlyWage);
    }
}
