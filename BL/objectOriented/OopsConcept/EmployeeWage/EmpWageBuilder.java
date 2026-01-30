package objectOriented.OopsConcept.EmployeeWage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmpWageBuilder implements IEmpWageBuilder {

    private List<CompanyEmpWage> companyList = new ArrayList<>();

    @Override
    public void addCompanyEmpWage(String company, int wagePerHour,
                                  int workingDays, int maxHours) {

        companyList.add(
                new CompanyEmpWage(company, wagePerHour, workingDays, maxHours)
        );
    }

    @Override
    public void computeEmpWage() {

        for (CompanyEmpWage company : companyList) {
            computeCompanyWage(company);
            System.out.println(
                    company.company + " Total Wage = " + company.totalWage
            );
        }
    }

    private void computeCompanyWage(CompanyEmpWage company) {

        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        Random random = new Random();

        while (totalHours < company.maxHours &&
                totalDays < company.workingDays) {

            totalDays++;
            int empType = random.nextInt(3);
            int empHours;

            switch (empType) {
                case 1:
                    empHours = 8;
                    break;
                case 2:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }

            if (totalHours + empHours > company.maxHours) {
                empHours = company.maxHours - totalHours;
            }

            int dailyWage = empHours * company.wagePerHour;
            company.dailyWages.add(dailyWage);

            totalHours += empHours;
            totalWage += dailyWage;
        }

        company.setTotalWage(totalWage);
    }

    /**
     * UC14: Get total wage by company name
     */
    @Override
    public int getTotalWage(String companyName) {

        for (CompanyEmpWage company : companyList) {
            if (company.company.equalsIgnoreCase(companyName)) {
                return company.totalWage;
            }
        }
        return 0;
    }
}
