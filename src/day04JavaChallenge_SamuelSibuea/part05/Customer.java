package day04JavaChallenge_SamuelSibuea.part05;

public class Customer extends Person {

    private double totalPurchase;

    public Customer(String nasionalId, String fullname) {
        super(nasionalId, fullname);
    }

    @Override
    String InfoPerson() {
        return "Total Purchase : " +this.totalPurchase;
    }
}
