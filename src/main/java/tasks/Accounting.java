package tasks;

import java.text.DecimalFormat;
import java.util.Scanner;

class Accounting {
    private void pay(double workHours, double payPerHour) {
        DecimalFormat df = new DecimalFormat("#.##");
        double payment = workHours * payPerHour;
        System.out.println(df.format(payment));
    }

    void calculateSalary() {
        Scanner inputWorkHours = new Scanner(System.in);
        System.out.print("Input working hours: ");
        String workHours = inputDataAndValidation(inputWorkHours);

        Scanner inputPayPerHour = new Scanner(System.in);
        System.out.print("Input pay per hour: ");
        String payPerHour = inputDataAndValidation(inputPayPerHour);

        Accounting accounting = new Accounting();
        System.out.print("Your salary = ");
        accounting.pay(Double.parseDouble((workHours)), Double.parseDouble(payPerHour));
    }

    private static String inputDataAndValidation(Scanner inputScanner) {
        String regex = "\\d+";
        String readData = inputScanner.nextLine();
        boolean isNumbers = readData.matches(regex);
        while (!isNumbers) {
            System.out.println("Please enter a number.");
            readData = inputScanner.nextLine();
            isNumbers = readData.matches(regex);
        }
        return readData;
    }
}
