package tasks;

import java.text.DecimalFormat;

public class Accounting {
    public void pay(double workHours, double payPerHour){
        DecimalFormat df = new DecimalFormat("#.##");
        double payment = workHours * payPerHour;
        System.out.println(df.format(payment));
    }

    public static void main(String[] args) {
        Accounting accounting = new Accounting();
        accounting.pay(1.5,10.6);
    }
}
