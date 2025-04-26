package day03_Samuel_ChallangeJava;

import day03JavaChallange_SamuelSibuea.VehiclePurchase;
import day03JavaChallange_SamuelSibuea.VehicleType;

import java.time.LocalDate;

public class Car extends VehiclePurchase {
    public Car(String noPolice, VehicleType vehicletype, int year, double price, double tax, int seat, LocalDate transactionDate) {
        super(noPolice, vehicletype, year, price, tax, seat, transactionDate);
    }


}
