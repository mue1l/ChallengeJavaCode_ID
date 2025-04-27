package day03Java_Samuel.part06.hr;

import day03Java_Samuel.part05.Roles;
import day03Java_Samuel.part06.ISalary;
import day03Java_Samuel.part06.salary.Commission;
import day03Java_Samuel.part06.salary.Overtime;

import java.time.LocalDate;

public class Sales extends Employee implements ISalary {
    private Commission commission;
    private Overtime overtime;

    public Sales(int empId, String fullName, LocalDate hireDate, Roles role,
                 double salary, Commission commission, Overtime overtime) {
        super(empId, fullName, hireDate, role, salary);
        this.commission = commission;
        this.overtime = overtime;
    }

    @Override
    public void calculateTotalSalary() {
        setTotalSalary(getSalary() + commission.getBonus() + commission.getCommission() + overtime.getMakan());
    }
}