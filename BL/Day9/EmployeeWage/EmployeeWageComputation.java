package Day9.EmployeeWage;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 8;

        int maxWorkingDays = 20;
        int maxWorkingHours = 100;

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalMonthlyWage = 0;

        // UC6: Calculate wage till max hours or max days reached
        while (totalWorkingDays < maxWorkingDays && totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            int empType = (int) (Math.random() * 3); // 0-Absent, 1-Full Time, 2-Part Time
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

            // Prevent exceeding max hours
            if (totalWorkingHours + dailyHours > maxWorkingHours) {
                dailyHours = maxWorkingHours - totalWorkingHours;
            }

            totalWorkingHours += dailyHours;
            totalMonthlyWage += dailyHours * wagePerHour;
        }

        System.out.println("Total Working Days = " + totalWorkingDays);
        System.out.println("Total Working Hours = " + totalWorkingHours);
        System.out.println("Total Monthly Wage = " + totalMonthlyWage);
    }
}
