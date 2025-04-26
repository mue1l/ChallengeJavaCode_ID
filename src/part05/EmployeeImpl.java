package part05;

import java.time.LocalDate;
import java.util.List;

public class EmployeeImpl implements IEmployee {
    @Override
    public List<Employee> initListEmployee() {
        Programmer empl1 = new Programmer("200","Samuel",
                12, LocalDate.of(2025,6,29), Roles.PROGRAMMER,5_000_000,
                0,500_000);
        Programmer empl2 = new Programmer("201","Budi",
                12, LocalDate.of(2025,6,29), Roles.PROGRAMMER,5_000_000,
                0,500_000);
        Programmer empl3 = new Programmer("202","Anton",
                12, LocalDate.of(2025,6,29), Roles.PROGRAMMER,5_000_000,
                0,500_000);

        return List.of(empl1,empl2,empl3);
    }

    @Override
    public Employee findEmployeeById(List<Employee>emps, int id) {
        for (Employee emp : emps) {
            if(emp.getEmpid()== id)return emp;
        }
        return null;
    }

    @Override
    public List<Employee> findEmployeeBysalary(List<Employee> emps, double salary) {
        return List.of();
    }

    @Override
    public void displayEmployee(List<Employee> emps) {
        for (Employee emp : emps) {
            System.out.println(emp.toString());
        }
    }
}
