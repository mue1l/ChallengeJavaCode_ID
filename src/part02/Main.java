package part02;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee empl = new Employee(); // default contstructor
        empl.setEmpid(1);
        empl.setFullname("Samuel");
        empl.setSalary(5_000_000);
        empl.setHiredate(LocalDate.of(2025,9, 29));

        // System.out.println(empl.toString());

        Employee empl2 = new Employee(2, "Novrael",
                LocalDate.of(2025,6,29),
                "Programmer",4_000_000);

        // System.out.println(empl2.toString());

        Employee empl3 = new Employee("herbeth",
                LocalDate.of(2025,6,29),
                "sales",4_000_000);

        // System.out.println(empl3.toString());

        List<Employee> ListEmployee = List.of(empl,empl2, empl3);
        for (Employee emp : ListEmployee){
            System.out.println(emp.toString());
        }








    }
}
