package day04JavaChallenge_SamuelSibuea.part03;

import java.time.LocalDate;
import java.util.Random;

public class Employee {

    // atribute instan
    private int empid;
    private String fullname;
    private LocalDate hiredate;
    private String role;
    private double salary;
    private double totalSallary;
    public static int totalEmployee;

    // defalut constructor agar tidak error, buat constructor baru


    public Employee() {
        totalEmployee++;
    }


    // constructor
    public Employee(int empid, String fullname, LocalDate hiredate, String role, double salary) {
        this.empid = empid;
        this.fullname = fullname;
        this.hiredate = hiredate;
        this.role = role;
        this.salary = salary;
        totalEmployee++;

    }

    // overloading constuctor
    public Employee(String fullname, LocalDate hiredate,
                    String role, double salary)
    {
        Random randam = new Random();
        this.empid = randam.nextInt(3, 10);
        this.fullname = fullname;
        this.hiredate = hiredate;
        this.role = role;
        this.salary = salary;
        totalEmployee++;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 10_000_000){
            throw  new IllegalArgumentException("Salary melebihi batas");
        }
        this.salary = salary;

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }

    public double getTotalSallary() {
        return totalSallary;
    }

    public void setTotalSallary(double totalSallary) {

        this.totalSallary = totalSallary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", fullname='" + fullname + '\'' +
                ", hiredate=" + hiredate +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", totalSallary=" + totalSallary +
                '}';
    }
}
