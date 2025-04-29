package Day06JavaChallange_SamuelSibuea.Allowance;

import java.time.LocalDate;

public class Operational {
    private int days;
    private double lunch;
    private double transport;

    public Operational(LocalDate now, int days, double lunch, double transport) {
        this.days = days;
        this.lunch = lunch;
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getLunch() {
        return lunch;
    }

    public void setLunch(double lunch) {
        this.lunch = lunch;
    }

    public double getTransport() {
        return transport;
    }

    public void setTransport(double transport) {
        this.transport = transport;
    }
}
