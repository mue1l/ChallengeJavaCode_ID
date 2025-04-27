package day03Java_Samuel.part05;//package day03Java_Samuel.part05;
//
//import java.time.LocalDate;
//
//public class QA extends Employee {
//    private double makan;
//
//    public QA(String fullname, LocalDate hiredate, double salary, double makan) {
//        super(fullname, hiredate, String.valueOf(Roles.QA), salary);
//        this.makan = makan;
//        setTotalSallary(salary+makan);
//    }
//
//    public double getMakan() {
//        return makan;
//    }
//
//    public void setMakan(double makan) {
//        this.makan = makan;
//        super.setTotalSallary(this.getSalary()+makan);
//    }
//
//    @Override
//    public void setTotalSallary(double totalSallary) {
//        super.setTotalSallary(totalSallary);
//    }
//
//    @Override
//    public String toString() {
//        return super.toString()+
//                "makan=" + makan +
//                '}';
//    }
//}
