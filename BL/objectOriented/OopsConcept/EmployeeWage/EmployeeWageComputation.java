package objectOriented.OopsConcept.EmployeeWage;

public class EmployeeWageComputation {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        IEmpWageBuilder empWageBuilder = new EmpWageBuilder();

        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 110);

        empWageBuilder.computeEmpWage();

        System.out.println(
                "Queried Wage for TCS = " +
                        empWageBuilder.getTotalWage("TCS")
        );
    }
}
