package objectOriented.OopsConcept.EmployeeWage;

import java.util.Random;

/**
 * EmpWageBuilder manages wage computation for multiple companies
 */
public class EmpWageBuilder {

    private static final int IS_ABSENT = 0;
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    private final CompanyEmpWage[] companies;
    private int companyCount = 0;

    public EmpWageBuilder(int totalCompanies) {
        companies = new CompanyEmpWage[totalCompanies];
    }

    public void addCompanyEmpWage(String companyName, int wagePerHour,
                                  int maxWorkingDays, int maxWorkingHours) {

        companies[companyCount++] =
                new CompanyEmpWage(companyName, wagePerHour,
                        maxWorkingDays, maxWorkingHours);
    }

    public void computeEmployeeWages() {
        for (int i = 0; i < companyCount; i++) {
            computeEmployeeWage(companies[i]);
        }
    }

    private void computeEmployeeWage(CompanyEmpWage company) {

        Random random = new Random();
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays < company.maxWorkingDays
                && totalWorkingHours < company.maxWorkingHours) {

            totalWorkingDays++;
            int empCheck = random.nextInt(3);
            int workingHours;

            switch (empCheck) {
                case IS_FULL_TIME:
                    workingHours = 8;
                    break;
                case IS_PART_TIME:
                    workingHours = 8;
                    break;
                default:
                    workingHours = 0;
            }

            if (totalWorkingHours + workingHours > company.maxWorkingHours) {
                workingHours = company.maxWorkingHours - totalWorkingHours;
            }

            totalWorkingHours += workingHours;
            company.totalWage += workingHours * company.wagePerHour;
        }
    }

    public void displayTotalWages() {
        for (int i = 0; i < companyCount; i++) {
            System.out.println(
                    "Total Wage for " + companies[i].companyName +
                            " : " + companies[i].totalWage
            );
        }
    }
}
