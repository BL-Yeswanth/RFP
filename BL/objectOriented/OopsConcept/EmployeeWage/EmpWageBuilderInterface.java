package objectOriented.OopsConcept.EmployeeWage;

/**
 * Interface defining employee wage computation operations
 */
public interface EmpWageBuilderInterface {

    void addCompanyEmpWage(String companyName, int wagePerHour,
                           int maxWorkingDays, int maxWorkingHours);

    void computeEmployeeWages();

    int getTotalWage(String companyName);
}
