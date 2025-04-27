package day03Java_Samuel.part06;

import day03Java_Samuel.part06.hr.Employee;
import day03Java_Samuel.part06.hr.Programmer;
import day03Java_Samuel.part06.hr.QA;
import day03Java_Samuel.part06.hr.Sales;

import java.util.List;

public interface IEmployee {
    List<Employee> initListEmployee();

    void displayEmployees(List<Programmer> employees);

    void generateSalary(List<Programmer> employees);

    void displaySales(List<Sales> employees);
    void generateSalarySales(List<Sales> employees);

    void displayQa(List<QA> employees);
    void generateSalaryQa(List<QA> employees);
}