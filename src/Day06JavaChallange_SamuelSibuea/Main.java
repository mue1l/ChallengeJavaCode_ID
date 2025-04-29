package Day06JavaChallange_SamuelSibuea;

import Day06JavaChallange_SamuelSibuea.Implementasi.HRServiceImpl;
import Day06JavaChallange_SamuelSibuea.Implementasi.AllowanceServiceImpl;
import Day06JavaChallange_SamuelSibuea.Service.HRService;
import Day06JavaChallange_SamuelSibuea.Service.AllowanceService;
import Day06JavaChallange_SamuelSibuea.hr.Contract;
import Day06JavaChallange_SamuelSibuea.hr.Magang;
import Day06JavaChallange_SamuelSibuea.hr.Permanent;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HRService empInf = new HRServiceImpl();
        var employees = empInf.initListEmployee();

        AllowanceService sal = new AllowanceServiceImpl();
        var employeesSal = empInf.initListEmployee();

        List<Permanent> permanents = employees.stream()
                .filter(Permanent.class::isInstance)
                .map(Permanent.class::cast)
                .collect(Collectors.toList());

        List<Contract> contracts = employees.stream()
                .filter(Contract.class::isInstance)
                .map(Contract.class::cast)
                .collect(Collectors.toList());

        List<Magang> magangs = employees.stream()
                .filter(Magang.class::isInstance)
                .map(Magang.class::cast)
                .collect(Collectors.toList());


        sal.generateInsurance(permanents);
        sal.generateOvertime(permanents);
        sal.generateOperational(permanents);
        sal.generateTax(permanents);

        sal.generateInsuranceContract(contracts);
        sal.generateOvertimeContract(contracts);
        sal.generateTaxContract(contracts);

        sal.generatateOperationalMagang(magangs);

        sal.generateTotalSalaryPermanent(permanents);
        sal.generateTotalSalaryContract(contracts);
        sal.generateTotalSalaryMagang(magangs);
        empInf.displayEmployees(permanents,contracts,magangs);

    }
}
