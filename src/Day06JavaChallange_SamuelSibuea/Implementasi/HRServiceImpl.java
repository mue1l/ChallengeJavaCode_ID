package Day06JavaChallange_SamuelSibuea.Implementasi;

import Day06JavaChallange_SamuelSibuea.Allowance.Insurence;
import Day06JavaChallange_SamuelSibuea.Allowance.Operational;
import Day06JavaChallange_SamuelSibuea.Allowance.Overtime;
import Day06JavaChallange_SamuelSibuea.Allowance.Tax;
import Day06JavaChallange_SamuelSibuea.Service.HRService;
import Day06JavaChallange_SamuelSibuea.hr.*;


import java.time.LocalDate;
import java.util.List;

public class HRServiceImpl implements HRService {


    @Override
    public List<Employee> initListEmployee() {
        Permanent perm = new Permanent(100,"Anton", LocalDate.of(2025,6,5),Status.PERMANENT,20_000_000,
                new Insurence(LocalDate.now(), 1, 2, 2),
                new Overtime(LocalDate.now(), 10, 50_000),
                new Operational(LocalDate.now(), 2, 30_000, 20_000),
                new Tax(LocalDate.now(), 0.5, 0.5, 0));

        Contract conc = new Contract(101,"Charlie", LocalDate.of(2025,6,5),Status.CONTRACT,15_000_000,
                new Insurence(LocalDate.now(), 1, 3, 2),
                new Overtime(LocalDate.now(), 5, 45_000),
                new Tax(LocalDate.now(), 0.5, 0.5, 0));

        Magang magang = new Magang(102,"Gita", LocalDate.of(2025,6,5),Status.MAGANG,0,
                new Operational(LocalDate.now(), 25, 30_000, 20_000));

        return List.of(perm,conc,magang);
    }


    @Override
    public void displayEmployees(List<Permanent> employees, List<Contract> contracts, List<Magang> magangs) {
        int totalEmployee = employees.size() + contracts.size() + magangs.size();
        int totalInsurance = 0;
        int totalEndSalary = 0;
        int totalOvertime = 0;
        int totalOperational = 0;
        int totalTax = 0;

        for (Permanent emp : employees) {
            totalInsurance += emp.getTotalInsurance();
            totalOvertime += emp.getTotalOvertime();
            totalOperational += emp.getTotalOperational();
            totalEndSalary += emp.getTotalSalary();
            totalTax += emp.getTotalTax();
            System.out.println(emp);
        }

        for (Contract emp : contracts) {
            totalInsurance += emp.getTotalInsurance();
            totalOvertime += emp.getTotalOvertime();
            totalOperational += emp.getTotalOperational();
            totalEndSalary += emp.getTotalSalary();
            totalTax += emp.getTotalTax();
            System.out.println(emp);
        }

        for (Magang emp : magangs) {
            totalInsurance += emp.getTotalInsurance();
            totalOvertime += emp.getTotalOvertime();
            totalOperational += emp.getTotalOperational();
            totalEndSalary += emp.getTotalSalary();
            totalTax += emp.getTotalTax();
            System.out.println(emp);
        }

        System.out.println("Total Employee     : " + totalEmployee);
        System.out.println("Total Salary       : Rp " + totalEndSalary);
        System.out.println("Total Insurance    : Rp " + totalInsurance);
        System.out.println("Total Overtime     : Rp " + totalOvertime);
        System.out.println("Total Operational  : Rp " + totalOperational);
        System.out.println("Total Tax          : Rp " + totalTax);
    }



}
