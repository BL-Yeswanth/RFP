package Day9.EmployeeWage;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int wagePerHour = 20;
        int fullDayHour = 8;

        int isPresent = (int) (Math.random() * 2); // 0 or 1
        int dailyWage = 0;

        if (isPresent == 1) {
            dailyWage = wagePerHour * fullDayHour;
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

        System.out.println("Daily Employee Wage = " + dailyWage);
    }
}
