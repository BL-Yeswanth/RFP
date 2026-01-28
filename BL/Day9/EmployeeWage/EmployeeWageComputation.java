package Day9.EmployeeWage;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 8;
        int workingDaysPerMonth = 20;

        int totalMonthlyWage = 0;

        // UC5: Calculate Monthly Wage
        for (int day = 1; day <= workingDaysPerMonth; day++) {

            int empType = (int) (Math.random() * 3); // 0-Absent, 1-Full Time, 2-Part Time
            int dailyWage = 0;

            switch (empType) {

                case 1:
                    dailyWage = wagePerHour * fullDayHour;
                    break;

                case 2:
                    dailyWage = wagePerHour * partTimeHour;
                    break;

                default:
                    dailyWage = 0;
            }

            totalMonthlyWage += dailyWage;
        }

        System.out.println("Total Monthly Employee Wage = " + totalMonthlyWage);
    }
}
