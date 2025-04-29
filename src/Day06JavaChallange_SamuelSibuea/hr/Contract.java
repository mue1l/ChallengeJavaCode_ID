package Day06JavaChallange_SamuelSibuea.hr;

import Day06JavaChallange_SamuelSibuea.Allowance.Insurence;
import Day06JavaChallange_SamuelSibuea.Allowance.Overtime;
import Day06JavaChallange_SamuelSibuea.Allowance.Tax;

import java.time.LocalDate;

public class Contract extends Employee{
    private Insurence insurence;
    private Overtime overtime;
    private Tax tax;

    public Contract(int empId, String fullName, LocalDate hireDate, Status status, double salary, Insurence insurence, Overtime overtime, Tax tax) {
        super(empId, fullName, hireDate, status, salary);
        this.insurence = insurence;
        this.overtime = overtime;
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
