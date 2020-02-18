package tasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Accounting {
    public void pay(double workHours, double payPerHour){
        DecimalFormat df = new DecimalFormat("#.##");
        double payment = workHours * payPerHour;
        System.out.println(df.format(payment));
    }

    public void calculateSalary() {
        Scanner inputWorkHours = new Scanner(System.in);
        System.out.print("Input working hours: ");
        double workHours = inputWorkHours.nextDouble();

        Scanner inputPayPerHour = new Scanner(System.in);
        System.out.print("Input pay per hour: ");
        double payPerHour = inputPayPerHour.nextDouble();

        Accounting accounting = new Accounting();
        System.out.print("Your salary = ");
        accounting.pay(workHours,payPerHour);
    }
}
