package Day9.EmployeeWage;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 8;

        int empType = (int) (Math.random() * 3); // 0, 1, 2
        int dailyWage = 0;

        if (empType == 1) {
            dailyWage = wagePerHour * fullDayHour;
            System.out.println("Employee is Full Time");

        } else if (empType == 2) {
            dailyWage = wagePerHour * partTimeHour;
            System.out.println("Employee is Part Time");

        } else {
            System.out.println("Employee is Absent");
        }

        System.out.println("Daily Employee Wage = " + dailyWage);
    }
}
