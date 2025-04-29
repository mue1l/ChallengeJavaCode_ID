package Day06JavaChallange_SamuelSibuea.hr;

import java.time.LocalDate;

public abstract class Employee {
    private int empId;
    private String fullName;
    private LocalDate hireDate;
    private Status status;
    private double salary;
    private int totalEmployee;
    private double totalSalary;
    private double totalInsurance;
    private double totalOvertime;
    private double totalOperational;
    private double totalTax;

    public Employee(int empId, String fullName, LocalDate hireDate, Status status, double salary) {
        this.empId = empId;
        this.fullName = fullName;
        this.hireDate = hireDate;
        this.status = status;
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    public void setTotalEmployee(int totalEmployee) {
        this.totalEmployee = totalEmployee;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public double getTotalInsurance() {
        return totalInsurance;
    }

    public void setTotalInsurance(double totalInsurance) {
        this.totalInsurance = totalInsurance;
    }

    public double getTotalOvertime() {
        return totalOvertime;
    }

    public void setTotalOvertime(double totalOvertime) {
        this.totalOvertime = totalOvertime;
    }

    public double getTotalOperational() {
        return totalOperational;
    }

    public void setTotalOperational(double totalOperational) {
        this.totalOperational = totalOperational;
    }

    public double getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", fullName='" + fullName + '\'' +
                ", hireDate=" + hireDate +
                ", status=" + status +
                ", salary=" + salary +
                ", totalInsurance=" + totalInsurance +
                ", totalOvertime=" + totalOvertime +
                ", totalOperational=" + totalOperational +
                ", totalTax=" + totalTax +
                ", totalSalary=" + totalSalary +
                '}';
    }


    public abstract void setTotalInsurance();

    public abstract void setTotalOvertime();


    public abstract void setTotalOperational();

    public abstract void setTotalTax();

    public void setTotalSalary() {

    }
}
