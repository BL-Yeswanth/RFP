package Day8;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;

        int maxWorkingDays = 20;
        int maxWorkingHours = 100;

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalMonthlyWage = 0;

        // UC6: Calculate wage till total working hours or days reached
        while (totalWorkingDays < maxWorkingDays && totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            int empType = (int) (Math.random() * 3); // 0,1,2
            int dailyHours = 0;

            switch (empType) {

                case 1: // Full Time
                    dailyHours = fullDayHour;
                    break;

                case 2: // Part Time
                    dailyHours = partTimeHour;
                    break;

                default: // Absent
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
