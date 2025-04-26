package part05;

import java.util.List;

public interface IEmployee {
    List<Employee> initListEmployee();

    // 1 object employee
    Employee findEmployeeById(List<Employee>emps, int id);
    List<Employee> findEmployeeBysalary(List<Employee> emps, double salary);

    void displayEmployee(List<Employee> emps);

}
