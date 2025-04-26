package part04;

import java.time.LocalDate;

public class Sales extends Employee{
    private double bonus;

    // constructor
    public Sales(String fullname, LocalDate hiredate, double salary, double bonus) {
        super(fullname, hiredate, String.valueOf(Roles.SALES), salary);
        this.bonus = bonus;
        setTotalSallary(salary+bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
        super.setTotalSallary(this.getSalary()+bonus);
    }
    @Override
    public String toString() {
        return super.toString()+
                "bonus=" + bonus +
                '}';
    }


}
