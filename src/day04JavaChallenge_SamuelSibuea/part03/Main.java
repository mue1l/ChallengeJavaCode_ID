package day04JavaChallenge_SamuelSibuea.part03;

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

        Programmer prog = new Programmer("budiman", LocalDate.of(2025,6,7),
                6000000,500000);

        prog.setTransportasi(800000);


        List<Employee> ListEmployee = List.of(empl,empl2, empl3, prog);
        for (Employee emp : ListEmployee){
            System.out.println(emp.toString());
        }


        // total employee itu dimiliki ole class bukan objek
        System.out.println("Total Employee :"+Employee.totalEmployee);



    }
}
