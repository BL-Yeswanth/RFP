package objectOriented.Day8;

public class EmployeeWageComputation {

    // Class Variables
    static int wagePerHour = 20;
    static int fullDayHour = 8;
    static int partTimeHour = 4;
    static int maxWorkingDays = 20;
    static int maxWorkingHours = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        computeEmployeeWage();
    }

    // UC7: Class Method to Compute Employee Wage
    public static void computeEmployeeWage() {

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalMonthlyWage = 0;

        while (totalWorkingDays < maxWorkingDays &&
                totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            int empType = (int) (Math.random() * 3); // 0,1,2
            int dailyHours = 0;

            switch (empType) {

                case 1:
                    dailyHours = fullDayHour;
                    break;

                case 2:
                    dailyHours = partTimeHour;
                    break;

                default:
                    dailyHours = 0;
            }

            totalWorkingHours += dailyHours;
            totalMonthlyWage += dailyHours * wagePerHour;
        }

        System.out.println("Total Working Days = " + totalWorkingDays);
        System.out.println("Total Working Hours = " + totalWorkingHours);
        System.out.println("Total Monthly Wage = " + totalMonthlyWage);
    }
}
