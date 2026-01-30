package objectOriented.OopsConcept.EmployeeWage;

public interface IEmpWageBuilder {

    void addCompanyEmpWage(String company, int wagePerHour,
                           int workingDays, int maxHours);

    void computeEmpWage();

    int getTotalWage(String company);
}
