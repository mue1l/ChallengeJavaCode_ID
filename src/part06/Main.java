package part06;

import part06.hr.Programmer;

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


        //generate salary
        empInf.generateSalary(programmers);

        empInf.displayEmployees(programmers);
    }
}