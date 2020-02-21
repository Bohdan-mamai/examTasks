package tasks;

import java.text.NumberFormat;
import java.util.Scanner;

class ConvertNumberToWord {

    private static String[] units = {"", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"};

    private static String[] tens = {
            "",
            "",
            "Twenty",
            "Thirty",
            "Forty",
            "Fifty",
            "Sixty",
            "Seventy",
            "Eighty",
            "Ninety"
    };

    private static String convert(int n) {
        if (n < 0) {
            return "Minus " + convert(-n);
        }

        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }

        if (n < 100000) {
            return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
        }

        if (n < 1000000) {
            return convert(n / 100000) + " Hundred" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
        }
        return convert(n / 1000000) + " Million" + ((n % 1000000 != 0) ? " " : "") + convert(n % 1000000);
    }

    private static String inputDataAndValidation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert: ");
        String regex = "-?\\d+";
        String inputData = sc.nextLine();
        boolean isNumbers = inputData.matches(regex);
        while (!isNumbers) {
            System.out.println("Please enter a number.");
            inputData = sc.nextLine();
            isNumbers = inputData.matches(regex);
        }
        return inputData;
    }

    void converter() {
        int number = Integer.parseInt(inputDataAndValidation());
           // for (int n = 10; n < 150; n++) {
        System.out.println(NumberFormat.getInstance().format(number) + " = " + convert(number));
           // }
    }
}
