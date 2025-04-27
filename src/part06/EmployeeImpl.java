package part06;

import part05.Roles;
import part06.hr.Employee;
import part06.hr.Programmer;
import part06.salary.Transportasi;

import java.time.LocalDate;
import java.util.List;

public class EmployeeImpl implements IEmployee{
    @Override
    public List<Employee> initListEmployee() {

        Programmer emp1 = new Programmer(101,"Yuli",
                LocalDate.of(2025,12,12), Roles.PROGRAMMER,6_000_000,
                new Transportasi(LocalDate.now(),500_000,150_000,100_00)
        );

        Programmer emp2 = new Programmer(102,"Widi",
                LocalDate.of(2025,12,12), Roles.PROGRAMMER,5_000_000,
                new Transportasi(LocalDate.now(),100_000,50_000,100_00)
        );


        return List.of(emp1,emp2);
    }

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
}