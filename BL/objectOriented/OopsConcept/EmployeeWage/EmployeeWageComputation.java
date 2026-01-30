package objectOriented.OopsConcept.EmployeeWage;

/**
 * Employee Wage Computation Program
 * UC12: ArrayList based company management
 */
public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        EmpWageBuilderInterface empWageBuilder =
                new EmpWageBuilder();

        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 120);
        empWageBuilder.addCompanyEmpWage("Wipro", 30, 20, 110);

        empWageBuilder.computeEmployeeWages();

        System.out.println("Total Wage for TCS : " +
                empWageBuilder.getTotalWage("TCS"));
        System.out.println("Total Wage for Infosys : " +
                empWageBuilder.getTotalWage("Infosys"));
        System.out.println("Total Wage for Wipro : " +
                empWageBuilder.getTotalWage("Wipro"));
    }
}
