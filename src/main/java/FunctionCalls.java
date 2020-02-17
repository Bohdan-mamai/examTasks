import tasks.*;

import java.util.Scanner;

public class FunctionCalls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        switch (key) {
            case 1:
                PrimeNumbers primeNumbers = new PrimeNumbers();
                primeNumbers.primeNumbers();
                break;
            case 2:
                SearchAlgorithm searchAlgorithm = new SearchAlgorithm();
                searchAlgorithm.searchNumber();
                break;
            case 3:
                EQSolver EQSolver = new EQSolver();
                EQSolver.calculateSqrt();
                break;
            case 4:
                StaticInformation calculateMean = new StaticInformation();
                calculateMean.mean();
                break;
            case 5:
                StaticInformation calculateDeviation = new StaticInformation();
                calculateDeviation.standartDeviation();
                break;
            case 6:
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.bubbleSortAlgorithmAscending();
                break;
            case 7:
                BubbleSort bubbleSortDescending = new BubbleSort();
                bubbleSortDescending.bubbleSortAlgorithmDescending();
                break;
        }
    }
}

