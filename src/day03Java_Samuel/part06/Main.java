package day03Java_Samuel.part06;

import day03Java_Samuel.part06.hr.Programmer;
import day03Java_Samuel.part06.hr.QA;
import day03Java_Samuel.part06.hr.Sales;


import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        IEmployee empInf = new EmployeeImpl();

        var employees = empInf.initListEmployee();

        List<Programmer> programmers = employees.stream()
                .filter(Programmer.class::isInstance)
                .map(Programmer.class::cast)
                .collect(Collectors.toList());

        List<Sales> Sales = employees.stream()
                .filter(Sales.class::isInstance)
                .map(Sales.class::cast)
                .collect(Collectors.toList());

        List<QA> QA = employees.stream()
                .filter(QA.class::isInstance)
                .map(QA.class::cast)
                .collect(Collectors.toList());


        //generate salary
        empInf.generateSalary(programmers);
        empInf.displayEmployees(programmers);

        empInf.generateSalarySales(Sales);
        empInf.displaySales(Sales);

        empInf.generateSalaryQa(QA);
        empInf.displayQa(QA);

    }
}