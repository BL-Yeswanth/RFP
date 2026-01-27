package Day8;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC1: Check Employee Attendance
        int isPresent = (int) (Math.random() * 2); // 0 or 1

        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage = 0;

        if (isPresent == 1) {
            System.out.println("Employee is Present");

            // UC2: Calculate Daily Wage
            dailyWage = wagePerHour * fullDayHour;
            System.out.println("Daily Employee Wage = " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Daily Employee Wage = " + dailyWage);
        }
    }
}
