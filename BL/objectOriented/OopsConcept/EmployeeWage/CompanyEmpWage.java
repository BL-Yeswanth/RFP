package objectOriented.OopsConcept.EmployeeWage;

/**
 * CompanyEmpWage stores company-specific wage details
 */
public class CompanyEmpWage {

    public final String companyName;
    public final int wagePerHour;
    public final int maxWorkingDays;
    public final int maxWorkingHours;
    public int totalWage;

    public CompanyEmpWage(String companyName, int wagePerHour,
                          int maxWorkingDays, int maxWorkingHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }
}
