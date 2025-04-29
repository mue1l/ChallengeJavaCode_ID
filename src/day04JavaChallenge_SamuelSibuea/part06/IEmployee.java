package day04JavaChallenge_SamuelSibuea.part06;

import day04JavaChallenge_SamuelSibuea.part06.hr.Employee;
import day04JavaChallenge_SamuelSibuea.part06.hr.Programmer;
import day04JavaChallenge_SamuelSibuea.part06.hr.QA;
import day04JavaChallenge_SamuelSibuea.part06.hr.Sales;

import java.util.List;

public interface IEmployee {
    List<Employee> initListEmployee();

    void displayEmployees(List<Programmer> employees);

    void generateSalary(List<Programmer> employees);

    void generateTax(List<Programmer> employees);

    void displaySales(List<Sales> employees);
    void generateSalarySales(List<Sales> employees);

    void generateTaxSales(List<Sales> employees);

    void displayQa(List<QA> employees);
    void generateSalaryQa(List<QA> employees);
    void generateTaxQa(List<QA> employees);
}