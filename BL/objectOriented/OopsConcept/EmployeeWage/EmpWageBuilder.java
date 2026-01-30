package objectOriented.OopsConcept.EmployeeWage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * EmpWageBuilder implements EmpWageBuilderInterface
 * UC12: Uses ArrayList to manage multiple companies
 */
public class EmpWageBuilder implements EmpWageBuilderInterface {

    private static final int IS_ABSENT = 0;
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    private final List<CompanyEmpWage> companyList;

    public EmpWageBuilder() {
        companyList = new ArrayList<>();
    }

    @Override
    public void addCompanyEmpWage(String companyName, int wagePerHour,
                                  int maxWorkingDays, int maxWorkingHours) {

        companyList.add(new CompanyEmpWage(
                companyName, wagePerHour,
                maxWorkingDays, maxWorkingHours));
    }

    @Override
    public void computeEmployeeWages() {
        for (CompanyEmpWage company : companyList) {
            computeEmployeeWage(company);
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

    @Override
    public int getTotalWage(String companyName) {
        for (CompanyEmpWage company : companyList) {
            if (company.companyName.equalsIgnoreCase(companyName)) {
                return company.totalWage;
            }
        }
        return 0;
    }
}
