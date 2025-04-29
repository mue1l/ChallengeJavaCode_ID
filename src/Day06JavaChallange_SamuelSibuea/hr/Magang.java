package Day06JavaChallange_SamuelSibuea.hr;

import Day06JavaChallange_SamuelSibuea.Allowance.Operational;

import java.time.LocalDate;

public class Magang extends Employee{
    private Operational operational;

    public Magang(int empId, String fullName, LocalDate hireDate, Status status, double salary, Operational operational) {
        super(empId, fullName, hireDate, status, salary);
        this.operational = operational;
    }

    public Operational getOperational() {
        return operational;
    }

    public void setOperational(Operational operational) {
        this.operational = operational;
    }

    @Override
    public void setTotalInsurance() {

    }

    @Override
    public void setTotalOvertime() {

    }

    @Override
    public void setTotalOperational() {
        setTotalOperational((operational.getDays())*(operational.getLunch()+operational.getTransport()));
    }

    @Override
    public void setTotalTax() {

    }

    @Override
    public void setTotalSalary() {
        super.setTotalSalary((int) (getSalary() - getTotalInsurance() - getTotalTax() + (getTotalOvertime()+ getTotalOperational())));
    }
}
