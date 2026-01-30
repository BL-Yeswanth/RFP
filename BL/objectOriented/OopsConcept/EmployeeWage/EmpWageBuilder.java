package objectOriented.OopsConcept.EmployeeWage;

import java.util.Random;

/**
 * EmpWageBuilder class
 * Stores company details and computes employee wage
 */
public class EmpWageBuilder {

    // Constants
    private static final int IS_ABSENT = 0;
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    // Instance Variables (UC9 requirement)
    private final String companyName;
    private final int wagePerHour;
    private final int maxWorkingDays;
    private final int maxWorkingHours;

    private int totalWage;

    /**
     * Constructor to initialize company data
     */
    public EmpWageBuilder(String companyName, int wagePerHour,
                          int maxWorkingDays, int maxWorkingHours) {

        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    /**
     * Computes employee wage and saves total wage
     */
    public void computeEmployeeWage() {

        Random random = new Random();

        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        totalWage = 0;

        while (totalWorkingDays < maxWorkingDays
                && totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            int empCheck = random.nextInt(3);
            int workingHours;

            switch (empCheck) {
                case IS_FULL_TIME:
                    workingHours = 8;
                    break;

                case IS_PART_TIME:
                    workingHours = 8;
                    break;

                default:
                    workingHours = 0;
            }

            if (totalWorkingHours + workingHours > maxWorkingHours) {
                workingHours = maxWorkingHours - totalWorkingHours;
            }

            totalWorkingHours += workingHours;
            totalWage += workingHours * wagePerHour;
        }
    }

    /**
     * Displays total wage for the company
     */
    public void displayTotalWage() {
        System.out.println("Total Wage for " + companyName + " : " + totalWage);
    }
}
