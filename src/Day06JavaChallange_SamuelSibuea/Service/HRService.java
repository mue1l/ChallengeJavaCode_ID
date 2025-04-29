package Day06JavaChallange_SamuelSibuea.Service;

import Day06JavaChallange_SamuelSibuea.hr.Contract;
import Day06JavaChallange_SamuelSibuea.hr.Employee;
import Day06JavaChallange_SamuelSibuea.hr.Magang;
import Day06JavaChallange_SamuelSibuea.hr.Permanent;


import java.util.List;

public interface HRService {
    List<Employee> initListEmployee();

    void displayEmployees(List<Permanent> employees, List<Contract> contracts, List<Magang> magangs);
}
