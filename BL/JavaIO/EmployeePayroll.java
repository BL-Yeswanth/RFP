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

    // Convert Object To String
    @Override
    public String toString() {

        return id
                + " "
                + name
                + " "
                + salary;
    }
}