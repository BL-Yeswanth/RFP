package objectOriented.OopsConcept.EmployeeWage;

/**
 * Employee Wage Computation Program
 * UC10: Manage Employee Wage for Multiple Companies
 */
public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmpWageBuilder empWageBuilder = new EmpWageBuilder(3);

        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 120);
        empWageBuilder.addCompanyEmpWage("Wipro", 30, 20, 110);

        empWageBuilder.computeEmployeeWages();
        empWageBuilder.displayTotalWages();
    }
}
