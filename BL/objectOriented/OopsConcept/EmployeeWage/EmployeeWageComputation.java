package objectOriented.OopsConcept.EmployeeWage;

import java.util.Random;

/**
 * Employee Wage Computation Program
 * UC1: Check Employee Attendance
 * UC2: Calculate Daily Employee Wage
 * UC3: Add Part Time Employee & Wage
 * UC4: Solve using Switch Case Statement
 * UC5: Calculate Wages for a Month
 * UC6: Calculate wages till max working hours or days is reached
 */
public class EmployeeWageComputation {

    // Constants
    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 8;

    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();

        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;

        // UC6: Calculate wage till max hours or max days
        while (totalWorkingDays < MAX_WORKING_DAYS
                && totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;

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

            // Ensure total hours do not exceed max limit
            if (totalWorkingHours + workingHours > MAX_WORKING_HOURS) {
                workingHours = MAX_WORKING_HOURS - totalWorkingHours;
            }

            totalWorkingHours += workingHours;
            int dailyWage = workingHours * WAGE_PER_HOUR;
            totalWage += dailyWage;

            System.out.println("Day " + totalWorkingDays
                    + " | Hours Worked: " + workingHours
                    + " | Daily Wage: " + dailyWage);
        }

        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Wage: " + totalWage);
    }
}
