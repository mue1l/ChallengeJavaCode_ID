package Day06JavaChallange_SamuelSibuea.Allowance;

import java.time.LocalDate;

public class Insurence extends Salary{
    private int self;
    private int dependent;
    private int medical;



    public Insurence(LocalDate now, int self, int dependent, int medical) {
        this.self = self;
        this.dependent = dependent;
        this.medical = medical;
    }

    public int getSelf() {
        return self;
    }

    public void setSelf(int self) {
        this.self = self;
    }

    public int getDependent() {
        return dependent;
    }

    public void setDependent(int dependent) {
        this.dependent = dependent;
    }

    public int getMedical() {
        return medical;
    }

    public void setMedical(int medical) {
        this.medical = medical;
    }

}
