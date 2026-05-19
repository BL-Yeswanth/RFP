import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

public class EmployeePayrollService {

    ArrayList<EmployeePayroll> employeeList =
            new ArrayList<>();

    // Add Employee
    public void addEmployee(
            EmployeePayroll employee) {

        employeeList.add(employee);
    }

    // Write Employee Payroll To File
    public void writeEmployeePayrollToFile(
            String fileName) {

        try {

            FileWriter writer =
                    new FileWriter(fileName);

            for (EmployeePayroll employee
                    : employeeList) {

                writer.write(
                        employee.toString()
                                + "\n"
                );
            }

            writer.close();

            System.out.println(
                    "Employee Payroll Written To File"
            );

        } catch (IOException e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }

    // Count Number Of Entries
    public int countEntries(
            String fileName) {

        int count = 0;

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(fileName)
                    );

            while (reader.readLine() != null) {

                count++;
            }

            reader.close();

        } catch (IOException e) {

            System.out.println(
                    e.getMessage()
            );
        }

        return count;
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

        // Add Employees
        service.addEmployee(employee1);

        service.addEmployee(employee2);

        String fileName =
                "employee_payroll.txt";

        // Write To File
        service.writeEmployeePayrollToFile(
                fileName
        );

        // Count Entries
        int entries =
                service.countEntries(
                        fileName
                );

        System.out.println(
                "Number Of Entries In File : "
                        + entries
        );
    }
}