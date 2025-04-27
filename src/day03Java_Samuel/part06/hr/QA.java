package day03Java_Samuel.part06.hr;

import day03Java_Samuel.part05.Roles;
import day03Java_Samuel.part06.ISalary;
import day03Java_Samuel.part06.salary.Overtime;

import java.time.LocalDate;

public class QA extends Employee implements ISalary {
    private Overtime overtime;

    public QA(int empId, String fullName, LocalDate hireDate, Roles role, double salary, Overtime overtime) {
        super(empId, fullName, hireDate, role, salary);
        this.overtime = overtime;
    }

    public Overtime getOvertime() {
        return overtime;
    }

    public void setOvertime(Overtime overtime) {
        this.overtime = overtime;
    }

    @Override
    public void calculateTotalSalary() {
        setTotalSalary(getSalary()+overtime.getMakan());
    }
}
