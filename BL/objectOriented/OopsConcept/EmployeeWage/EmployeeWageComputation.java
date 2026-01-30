package objectOriented.OopsConcept.EmployeeWage;

/**
 * Employee Wage Computation Program
 * UC9: Save Total Wage for Each Company
 */
public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // UC9: Create company objects
        EmpWageBuilder tcs = new EmpWageBuilder("TCS", 20, 20, 100);
        EmpWageBuilder infosys = new EmpWageBuilder("Infosys", 25, 22, 120);
        EmpWageBuilder wipro = new EmpWageBuilder("Wipro", 30, 20, 110);

        // Compute wages
        tcs.computeEmployeeWage();
        infosys.computeEmployeeWage();
        wipro.computeEmployeeWage();

        // Display saved wages
        tcs.displayTotalWage();
        infosys.displayTotalWage();
        wipro.displayTotalWage();
    }
}
