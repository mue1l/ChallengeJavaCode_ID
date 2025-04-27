package day03Java_Samuel.part05;

import java.time.LocalDate;

public class Employee extends Person {
    public Employee(String nasionalId, String fullname, int empid,
                    LocalDate hiredate, Roles role, double salary, double totalSallary) {
        super(nasionalId, fullname);
        this.empid = empid;
        this.hiredate = hiredate;
        this.role = role;
        this.salary = salary;
        this.totalSallary = totalSallary;
    }

    // atribute instan
    private int empid;
    private LocalDate hiredate;
    private Roles role;
    private double salary;
    private double totalSallary;
    public static int totalEmployee;

    // defalut constructor agar tidak error, buat constructor baru




    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
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
    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
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
                ", hiredate=" + hiredate +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", totalSallary=" + totalSallary +
                '}';
    }

    @Override
    String InfoPerson() {
        return "Employee{" +
                "empid=" + empid +
                ", hiredate=" + hiredate +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", totalSallary=" + totalSallary +
                '}';
    }
}
