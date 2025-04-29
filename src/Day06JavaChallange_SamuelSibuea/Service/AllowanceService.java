package Day06JavaChallange_SamuelSibuea.Service;

import Day06JavaChallange_SamuelSibuea.hr.Contract;
import Day06JavaChallange_SamuelSibuea.hr.Magang;
import Day06JavaChallange_SamuelSibuea.hr.Permanent;

import java.util.List;

public interface AllowanceService {
    void generateInsurance(List<Permanent> employees);
    void generateOvertime(List<Permanent> employees);
    void generateOperational(List<Permanent> employees);
    void generateTax(List<Permanent> employees);
    void generateTotalSalaryPermanent(List<Permanent> employees);

    void generateInsuranceContract(List<Contract> employees);
    void generateOvertimeContract(List<Contract> employees);
    void generateTaxContract(List<Contract> employees);
    void generateTotalSalaryContract(List<Contract> employees);

    void generatateOperationalMagang(List<Magang> employees);
    void generateTotalSalaryMagang(List<Magang> employees);


}
