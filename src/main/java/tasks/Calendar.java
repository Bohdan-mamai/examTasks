package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Calendar {
    private static String getAnimal(int year) {
        List<String> animals = Arrays.asList("Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig");
        int index = (year + 8) % 12;
        return animals.get(index);
    }

    private static String inputDataAndValidation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input year number: ");
        String regex = "\\d+";
        String inputData = sc.nextLine();
        boolean isNumbers = inputData.matches(regex);
        while (!isNumbers) {
            System.out.println("Please enter a number.");
            inputData = sc.nextLine();
            isNumbers = inputData.matches(regex);
        }
        return inputData;
    }

    void printYear() {
        int year = 2020;
        try {
            year = Integer.parseInt(inputDataAndValidation());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        if (year < 0) {
            System.out.println("Please enter valid data!");
        }
        System.out.println(year + " " + getAnimal(year));
    }

}