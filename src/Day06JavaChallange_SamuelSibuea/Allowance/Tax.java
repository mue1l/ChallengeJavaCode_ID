package Day06JavaChallange_SamuelSibuea.Allowance;

import java.time.LocalDate;

public class Tax {
    private double pph;
    private double tapera;
    private double ppn;

    public Tax(LocalDate now, double pph, double tapera, double ppn) {
        this.pph = pph;
        this.tapera = tapera;
        this.ppn = ppn;
    }

    public double getPph() {
        return pph;
    }

    public void setPph(double pph) {
        this.pph = pph;
    }

    public double getTapera() {
        return tapera;
    }

    public void setTapera(double tapera) {
        this.tapera = tapera;
    }

    public double getPpn() {
        return ppn;
    }

    public void setPpn(double ppn) {
        this.ppn = ppn;
    }
}
