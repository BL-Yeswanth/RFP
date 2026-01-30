package objectOriented.OopsConcept.EmployeeWage;

import java.util.Random;

/**
 * Employee Wage Computation Program
 * UC8: Compute Employee Wage for Multiple Companies
 */
public class EmployeeWageComputation {

    // Attendance constants
    public static final int IS_ABSENT = 0;
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    /**
     * Class Method to compute employee wage for a company
     *
     * @param companyName        Name of the company
     * @param wagePerHour        Wage per hour
     * @param maxWorkingDays     Maximum working days per month
     * @param maxWorkingHours    Maximum working hours per month
     */
    public static void computeEmployeeWage(
            String companyName,
            int wagePerHour,
            int maxWorkingDays,
            int maxWorkingHours) {

        Random random = new Random();

        int totalWorkingHours = 0;
        int totalWorkingDays = 0;
        int totalWage = 0;

        while (totalWorkingDays < maxWorkingDays
                && totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            int employeeCheck = random.nextInt(3);
            int workingHours;

            switch (employeeCheck) {
                case IS_FULL_TIME:
                    workingHours = 8;
                    break;

                case IS_PART_TIME:
                    workingHours = 8;
                    break;

                default:
                    workingHours = 0;
            }

            // Prevent exceeding max working hours
            if (totalWorkingHours + workingHours > maxWorkingHours) {
                workingHours = maxWorkingHours - totalWorkingHours;
            }

            totalWorkingHours += workingHours;
            int dailyWage = workingHours * wagePerHour;
            totalWage += dailyWage;
        }

        System.out.println("\nCompany: " + companyName);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Wage: " + totalWage);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC8: Multiple companies
        computeEmployeeWage("TCS", 20, 20, 100);
        computeEmployeeWage("Infosys", 25, 22, 120);
        computeEmployeeWage("Wipro", 30, 20, 110);
    }
}
