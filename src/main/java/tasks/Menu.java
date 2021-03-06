package tasks;

import tasks.cards.CallDeck;
import tasks.employee.TestEmployee;

import java.util.Scanner;

public class Menu {

    public static void displayMenu() {
        System.out.println("Enter a number of task which you want to play." +
                "\n1. eqSolver" +
                "\n2. Prime Numbers" +
                "\n3. Calendar" +
                "\n4. Convert number to word" +
                "\n5. Search algorithm" +
                "\n6. Calculate Mean" +
                "\n7. Calculate Median" +
                "\n8. Calculate Mode" +
                "\n9. Calculate Deviation" +
                "\n10. Bubble Sort Descending" +
                "\n11. Bubble Sort Ascending" +
                "\n12. Accounting" +
                "\n13. Display deck of cards" +
                "\n14. Create employees");

        switch (inputDataAndValidation()) {
            case 1:
                EQSolver eqSolver = new EQSolver();
                eqSolver.calculateSqrt();
                break;
            case 2:
                PrimeNumbers primeNumbers = new PrimeNumbers();
                primeNumbers.primeNumbers();
                break;
            case 3:
                Calendar calendar = new Calendar();
                calendar.printYear();
                break;
            case 4:
                ConvertNumberToWord convertNumberToWord = new ConvertNumberToWord();
                convertNumberToWord.converter();
                break;
            case 5:
                SearchAlgorithm searchAlgorithm = new SearchAlgorithm();
                searchAlgorithm.searchNumber();
                break;
            case 6:
                StaticInformation calculateMean = new StaticInformation();
                calculateMean.mean();
                break;
            case 7:
                StaticInformation calculateMedian = new StaticInformation();
                calculateMedian.median();
                break;
            case 8:
                StaticInformation calculateMode = new StaticInformation();
                calculateMode.mode();
                break;
            case 9:
                StaticInformation calculateDeviation = new StaticInformation();
                calculateDeviation.standardDeviation();
                break;
            case 10:
                BubbleSort bubbleSortDescending = new BubbleSort();
                bubbleSortDescending.bubbleSortAlgorithmDescending();
                break;
            case 11:
                BubbleSort bubbleSortAscending = new BubbleSort();
                bubbleSortAscending.bubbleSortAlgorithmAscending();
                break;
            case 12:
                Accounting accounting = new Accounting();
                accounting.calculateSalary();
                break;
            case 13:
                CallDeck callDeck = new CallDeck();
                callDeck.displayFullDeck();
                break;
            case 14:
                TestEmployee testEmployee = new TestEmployee();
                testEmployee.createEmployees();
                break;
        }
    }

    private static int inputDataAndValidation() {
        Scanner sc = new Scanner(System.in);
        String regex = "\\d+";
        String inputData = sc.nextLine();
        boolean isNumbers = inputData.matches(regex);
        while (!isNumbers) {
            System.out.println("Please enter a number.");
            inputData = sc.nextLine();
            isNumbers = inputData.matches(regex);
        }
        int key = Integer.parseInt(inputData);
        while (key < 1 || key > 14) {
            System.out.println("Please enter valid number from 1 to 14.");
            key = Integer.parseInt(sc.nextLine());
        }
        return key;
    }

}
