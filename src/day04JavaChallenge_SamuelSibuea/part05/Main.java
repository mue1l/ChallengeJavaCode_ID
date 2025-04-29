package day04JavaChallenge_SamuelSibuea.part05;

public class Main {
    public static void main(String[] args) {
        EmployeeImpl impInterface = new EmployeeImpl();

        var ListEmployee = impInterface.initListEmployee();
        impInterface.displayEmployee(ListEmployee);


    }
}
