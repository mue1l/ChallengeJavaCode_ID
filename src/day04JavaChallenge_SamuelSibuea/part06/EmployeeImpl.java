package day04JavaChallenge_SamuelSibuea.part06;

import day04JavaChallenge_SamuelSibuea.part05.Roles;
import day04JavaChallenge_SamuelSibuea.part06.hr.Employee;
import day04JavaChallenge_SamuelSibuea.part06.hr.Programmer;
import day04JavaChallenge_SamuelSibuea.part06.hr.QA;
import day04JavaChallenge_SamuelSibuea.part06.hr.Sales;
import day04JavaChallenge_SamuelSibuea.part06.salary.Commission;
import day04JavaChallenge_SamuelSibuea.part06.salary.Overtime;
import day04JavaChallenge_SamuelSibuea.part06.salary.Transportasi;

import java.time.LocalDate;
import java.util.List;

public class EmployeeImpl implements IEmployee{
    @Override
    public List<Employee> initListEmployee() {

        Programmer emp1 = new Programmer(101,"Anton",
                LocalDate.of(2025,12,12), Roles.PROGRAMMER,6_000_000,
                new Transportasi(LocalDate.now(),500_000,150_000,100_00)
        );

        Programmer emp2 = new Programmer(102,"Toni",
                LocalDate.of(2025,12,12), Roles.PROGRAMMER,5_000_000,
                new Transportasi(LocalDate.now(),100_000,50_000,100_00)
        );

        Sales emp3 = new Sales(103,"Samuel",
                LocalDate.of(2024,11,12), Roles.SALES,4_000_000,
                new Commission(LocalDate.now(),500_000,300_000), new Overtime(LocalDate.now(),500_000)
        );

        QA emp4 = new QA(104,"Budi",
                LocalDate.of(2024,11,12), Roles.QA,3_000_000,
                new Overtime(LocalDate.now(),500_000)
        );

        return List.of(emp1,emp2,emp3, emp4);
    }

    // Programmer
    @Override
    public void displayEmployees(List<Programmer> employees) {
        for(Employee emp : employees){

            System.out.println(emp.toString());
        }
    }

    @Override
    public void generateSalary(List<Programmer> employees) {
        for (Programmer emp : employees){
            emp.calculateTotalSalary();
        }
    }
    @Override
    public void generateTax(List<Programmer> employees) {
        for (Programmer emp : employees){
            emp.calculateTax();
        }
    }

    // Sales
    @Override
    public void displaySales(List<Sales> employees) {
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    @Override
    public void generateSalarySales(List<Sales> employees) {
        for (Sales emp : employees) {
            emp.calculateTotalSalary();
        }
    }
    @Override
    public void generateTaxSales(List<Sales> employees) {
        for (Sales emp : employees){
            emp.calculateTax();
        }
    }

    // QA

    @Override
    public void displayQa(List<QA> employees) {
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    @Override
    public void generateSalaryQa(List<QA> employees) {
        for (QA emp : employees) {
            emp.calculateTotalSalary();
        }
    }
    @Override
    public void generateTaxQa(List<QA> employees) {
        for (QA emp : employees){
            emp.calculateTax();
        }
    }
}