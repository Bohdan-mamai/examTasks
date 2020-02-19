package tasks;

import tasks.cards.CallDeck;
import tasks.employee.TestEmployee;

import java.util.Scanner;

public class Menu {

    public static void displayMenu(){
        System.out.println("Enter a number of task which you want to play.");
        System.out.println("1. eqSolver");
        System.out.println("2. Prime Numbers");
        System.out.println("3. Calendar");
        System.out.println("4. Convert number to word");
        System.out.println("5. Search algorithm");
        System.out.println("6. Calculate Mean");
        System.out.println("7. Calculate Median");
        System.out.println("8. Calculate Mode");
        System.out.println("9. Calculate Deviation");
        System.out.println("10. Bubble Sort Descending");
        System.out.println("11. Bubble Sort Ascending");
        System.out.println("12. Accounting");
        System.out.println("13. Display deck of cards");
        System.out.println("14. Create employee");

    Scanner sc = new Scanner(System.in);
    int key = sc.nextInt();

        switch (key) {
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
            calculateDeviation.standartDeviation();
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
            testEmployee.createEmpoyees();
            break;
    }
}
}
