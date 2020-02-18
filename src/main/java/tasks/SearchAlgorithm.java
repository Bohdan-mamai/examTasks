package tasks;

import java.util.Scanner;

public class SearchAlgorithm {

    private static int initArray(int[] inputArray, int number) {

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == number) {
                return i;
            }
        }
        return 0;
    }

    public void searchNumber() {
        int[] arrayWithRandomDigits = {158, 207, 392, 62, 315, 434, 487, 268, 405, 241};
        for (int arrayWithRandomDigit : arrayWithRandomDigits) {
            System.out.print(" " + arrayWithRandomDigit);
        }

        System.out.println("\nEnter your  which you want to find from array: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = initArray(arrayWithRandomDigits,number);
        System.out.println( (result != -1) ? "Required number: " + number + " found at index: " + result : "Number " + number + " not found");
    }
}

