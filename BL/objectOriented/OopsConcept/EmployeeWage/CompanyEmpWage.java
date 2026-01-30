package objectOriented.OopsConcept.EmployeeWage;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWage {

    public final String company;
    public final int wagePerHour;
    public final int workingDays;
    public final int maxHours;

    public int totalWage;
    public List<Integer> dailyWages;

    public CompanyEmpWage(String company, int wagePerHour,
                          int workingDays, int maxHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.maxHours = maxHours;
        this.dailyWages = new ArrayList<>();
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }
}
