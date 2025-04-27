package day03Java_Samuel.part05;

import java.time.LocalDate;

public class Programmer extends Employee {
    private double transportasi;

    public Programmer(String nationalId, String fullName, int empId,LocalDate hireDate, Roles role, double salary, double totalSalary, double transportasi) {
        super(nationalId, fullName, empId,  hireDate, role, salary, totalSalary);
        this.transportasi = transportasi;
        super.setTotalSallary(this.getSalary()+transportasi);
    }

    public double getTransportasi() {
        return transportasi;
    }

    public void setTransportasi(double transportasi) {
        this.transportasi = transportasi;
        super.setTotalSallary(this.getSalary()+transportasi);
    }

    @Override
    public void setTotalSallary(double totalSallary) {
        super.setTotalSallary(totalSallary);
    }

    @Override
    public String toString() {
        return super.toString()+ "Transportasi: " + transportasi;
    }
}
