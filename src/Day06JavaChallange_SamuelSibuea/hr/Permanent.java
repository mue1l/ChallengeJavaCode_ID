package Day06JavaChallange_SamuelSibuea.hr;

import Day06JavaChallange_SamuelSibuea.Allowance.Insurence;
import Day06JavaChallange_SamuelSibuea.Allowance.Operational;
import Day06JavaChallange_SamuelSibuea.Allowance.Overtime;
import Day06JavaChallange_SamuelSibuea.Allowance.Tax;

import java.time.LocalDate;

public class Permanent extends Employee {
    private Insurence insurence;
    private Overtime overtime;
    private Operational operational;
    private Tax tax;

    public Permanent(int empId, String fullName, LocalDate hireDate, Status status, double salary, Insurence insurence, Overtime overtime, Operational operational, Tax tax) {
        super(empId, fullName, hireDate, status, salary);
        this.insurence = insurence;
        this.overtime = overtime;
        this.operational = operational;
        this.tax = tax;
    }

    public Insurence getInsurence() {
        return insurence;
    }

    public void setInsurence(Insurence insurence) {
        this.insurence = insurence;
    }

    public Overtime getOvertime() {
        return overtime;
    }

    public void setOvertime(Overtime overtime) {
        this.overtime = overtime;
    }

    public Operational getOperational() {
        return operational;
    }

    public void setOperational(Operational operational) {
        this.operational = operational;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    @Override
    public void setTotalInsurance() {
        setTotalInsurance((getSalary()*insurence.getMedical()/100)*(insurence.getDependent()+insurence.getSelf()));
    }

    @Override
    public void setTotalOvertime() {
        setTotalOvertime(overtime.getHours()*overtime.getOvertime());
    }

    @Override
    public void setTotalOperational() {
        setTotalOperational((operational.getDays())*(operational.getLunch()+operational.getTransport()));
    }

    @Override
    public void setTotalTax() {
        setTotalTax((getSalary())*(tax.getPph()/100 + tax.getTapera()/100));
    }

    @Override
    public void setTotalSalary() {
        super.setTotalSalary((int) (getSalary() - getTotalInsurance() - getTotalTax() + (getTotalOvertime()+ getTotalOperational())));
    }
}
