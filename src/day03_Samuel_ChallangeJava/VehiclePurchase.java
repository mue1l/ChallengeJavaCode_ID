package day03_Samuel_ChallangeJava;

import day03JavaChallange_SamuelSibuea.VehicleType;

public class VehiclePurchase {
    private String noPolice;
    private VehicleType vehicleType;
    private int year;
    private double price;
    private double tax;
    private int seat;
    private double total;
    public static int totalCar;
    public static int totalBoat;
    public static int totalPlane;

    //constructor
    public VehiclePurchase(String noPolice, VehicleType vehicleType, int year, double price, double tax, int seat, double total) {
        this.noPolice = noPolice;
        this.vehicleType = vehicleType;
        this.year = year;
        this.price = price;
        this.tax = tax;
        this.seat = seat;
        this.total = total;
    }
    
    //getter dan setter

    public String getNoPolice() {
        return noPolice;
    }

    public void setNoPolice(String noPolice) {
        this.noPolice = noPolice;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public static int getTotalCar() {
        return totalCar;
    }

    public static void setTotalCar(int totalCar) {
        VehiclePurchase.totalCar = totalCar;
    }

    public static int getTotalBoat() {
        return totalBoat;
    }

    public static void setTotalBoat(int totalBoat) {
        VehiclePurchase.totalBoat = totalBoat;
    }

    public static int getTotalPlane() {
        return totalPlane;
    }

    public static void setTotalPlane(int totalPlane) {
        VehiclePurchase.totalPlane = totalPlane;
    }

    
    @Override
    public String toString() {
        return "VehiclePurchase{" +
                "noPolice='" + noPolice + '\'' +
                ", vehicleType=" + vehicleType +
                ", year=" + year +
                ", price=" + price +
                ", tax=" + tax +
                ", seat=" + seat +
                ", total=" + total +
                '}';
    }
}
