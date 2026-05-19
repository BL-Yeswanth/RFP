import java.util.ArrayList;

public class EmployeePayrollService {

    ArrayList<EmployeePayroll> employeeList =
            new ArrayList<>();

    // Add Employee
    public void addEmployee(
            EmployeePayroll employee) {

        employeeList.add(employee);
    }

    // Write Employee Payroll to Console
    public void writeEmployeePayroll() {

        System.out.println(
                "Employee Payroll Details"
        );

        for (EmployeePayroll employee
                : employeeList) {

            employee.displayEmployeeDetails();

            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {

        EmployeePayroll employee1 =
                new EmployeePayroll(
                        101,
                        "Yaswanth",
                        50000
                );

        EmployeePayroll employee2 =
                new EmployeePayroll(
                        102,
                        "Kiran",
                        60000
                );

        EmployeePayrollService service =
                new EmployeePayrollService();

        service.addEmployee(employee1);

        service.addEmployee(employee2);

        service.writeEmployeePayroll();
    }
}