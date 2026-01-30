package objectOriented.Day9.EmployeeWage;

public class EmployeeWageComputation {

    // Class Variables
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 8;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        computeEmployeeWage();
    }

    // UC7: Class Method to compute employee wage
    static void computeEmployeeWage() {

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalMonthlyWage = 0;

        while (totalWorkingDays < MAX_WORKING_DAYS
                && totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;

            int empType = (int) (Math.random() * 3); // 0-Absent, 1-Full, 2-Part
            int dailyHours = 0;

            switch (empType) {

                case 1:
                    dailyHours = FULL_DAY_HOUR;
                    break;

                case 2:
                    dailyHours = PART_TIME_HOUR;
                    break;

                default:
                    dailyHours = 0;
            }

            if (totalWorkingHours + dailyHours > MAX_WORKING_HOURS) {
                dailyHours = MAX_WORKING_HOURS - totalWorkingHours;
            }

            totalWorkingHours += dailyHours;
            totalMonthlyWage += dailyHours * WAGE_PER_HOUR;
        }

        System.out.println("Total Working Days = " + totalWorkingDays);
        System.out.println("Total Working Hours = " + totalWorkingHours);
        System.out.println("Total Monthly Wage = " + totalMonthlyWage);
    }
}
