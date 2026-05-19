public class EmployeePayroll {

    int id;
    String name;
    double salary;

    // Constructor
    public EmployeePayroll(
            int id,
            String name,
            double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Display Employee Details
    public void displayEmployeeDetails() {

        System.out.println(
                "Employee Id : " + id
        );

        System.out.println(
                "Employee Name : " + name
        );

        System.out.println(
                "Employee Salary : " + salary
        );
    }
}