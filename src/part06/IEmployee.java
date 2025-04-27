package part06;

import part06.hr.Employee;
import part06.hr.Programmer;

import java.util.List;

public interface IEmployee {
    List<Employee> initListEmployee();

    void displayEmployees(List<Programmer> employees);

    void generateSalary(List<Programmer> employees);
}