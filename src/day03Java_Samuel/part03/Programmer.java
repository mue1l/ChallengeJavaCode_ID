package day03Java_Samuel.part03;

import java.time.LocalDate;

public class Programmer extends Employee {
    private double transportasi;

    // constructor
    public Programmer(String fullname, LocalDate hiredate, double salary, double transportasi) {
        super(fullname, hiredate, "Programmer", salary);
        this.transportasi = transportasi;
        setTotalSallary(salary+transportasi);
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
