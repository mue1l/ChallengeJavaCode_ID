package Day06JavaChallange_SamuelSibuea.Implementasi;

import Day06JavaChallange_SamuelSibuea.Service.AllowanceService;
import Day06JavaChallange_SamuelSibuea.hr.Contract;
import Day06JavaChallange_SamuelSibuea.hr.Magang;
import Day06JavaChallange_SamuelSibuea.hr.Permanent;

import java.util.List;

public class AllowanceServiceImpl implements AllowanceService {



    @Override
    public void generateInsurance(List<Permanent> employees) {
        for (Permanent emp : employees) {
            emp.setTotalInsurance();
        }
    }

    @Override
    public void generateOvertime(List<Permanent> employees) {
        for (Permanent emp : employees) {
            emp.setTotalOvertime();
        }
    }

    @Override
    public void generateOperational(List<Permanent> employees) {
        for (Permanent emp : employees) {
            emp.setTotalOperational();
        }
    }

    @Override
    public void generateTax(List<Permanent> employees) {
        for (Permanent emp : employees) {
            emp.setTotalTax();
        }
    }

    @Override
    public void generateInsuranceContract(List<Contract> employees) {
        for (Contract contract : employees) {
            contract.setTotalInsurance();
        }
    }

    @Override
    public void generateOvertimeContract(List<Contract> employees) {
        for (Contract contract : employees) {
            contract.setTotalOvertime();
        }
    }

    @Override
    public void generateTaxContract(List<Contract> employees) {
        for (Contract contract : employees) {
            contract.setTotalTax();
        }
    }

    @Override
    public void generateTotalSalaryContract(List<Contract> employees) {
        for  (Contract contract : employees) {
            contract.setTotalSalary();
        }
    }

    @Override
    public void generatateOperationalMagang(List<Magang> employees) {
        for (Magang magang : employees) {
            magang.setTotalOperational();
        }
    }

    @Override
    public void generateTotalSalaryMagang(List<Magang> employees) {
        for (Magang magang : employees) {
            magang.setTotalSalary();
        }
    }

    @Override
    public void generateTotalSalaryPermanent(List<Permanent> employees) {
        for (Permanent emp : employees) {
            emp.setTotalSalary();
        }
    }
}
