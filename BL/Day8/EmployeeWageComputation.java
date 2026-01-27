package Day8;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int dailyWage = 0;

        // UC3: Employee Type
        int empType = (int) (Math.random() * 3); // 0, 1, 2

        switch (empType) {

            case 1:
                System.out.println("Employee is Full Time");
                dailyWage = wagePerHour * fullDayHour;
                break;

            case 2:
                System.out.println("Employee is Part Time");
                dailyWage = wagePerHour * partTimeHour;
                break;

            default:
                System.out.println("Employee is Absent");
                dailyWage = 0;
        }

        System.out.println("Daily Employee Wage = " + dailyWage);
    }
}
