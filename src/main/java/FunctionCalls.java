import tasks.FindMode;
import tasks.FirstTask;
import tasks.SearchAlgorithm;

import java.util.Scanner;

public class FunctionCalls {

    public static void main(String[] args) {

//        FirstTask firstTask = new FirstTask();
//        firstTask.primeNumbers();

//        SearchAlgorithm searchAlgorithm = new SearchAlgorithm();
//        searchAlgorithm.searchNumber();

//        StaticInformation staticInformation = new StaticInformation();
//        staticInformation.initArray();

//        FindMode findMode = new FindMode();
//        findMode.findMode();

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        switch (key) {
            case 1:
                FirstTask firstTask = new FirstTask();
                firstTask.primeNumbers();
                break;
            case 2:
                SearchAlgorithm searchAlgorithm = new SearchAlgorithm();
                searchAlgorithm.searchNumber();
                break;
        }
    }
}

