package Day06JavaChallange_SamuelSibuea.Allowance;

import java.time.LocalDate;

public class Overtime {
    private int hours;
    private double overtime;

    public Overtime(LocalDate now, int hours, double overtime) {
        this.hours = hours;
        this.overtime = overtime;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
}
