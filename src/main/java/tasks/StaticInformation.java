package tasks;

import java.util.Arrays;

public class StaticInformation {

    int[] arrayWithRandomDigits = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};
    int arrayLenght = arrayWithRandomDigits.length;

    public void mean() {
        print();
        double aritmeticMean = 0;
        for (int i = 0; i < arrayLenght; i++) {
            aritmeticMean += arrayWithRandomDigits[i];
        }
        aritmeticMean /= arrayLenght;
        System.out.println("\nMean = " + aritmeticMean);
    }

    public void median(){
        print();
        Arrays.sort(arrayWithRandomDigits);
        double median;
        if (arrayLenght % 2 == 0) {
            median = ((double) arrayWithRandomDigits[arrayLenght / 2] + (double) arrayWithRandomDigits[arrayLenght / 2 - 1]) / 2;
        } else {
            median = arrayWithRandomDigits[arrayLenght / 2];
        }
        System.out.println("\nMedian = " + median);
    }

    public void mode() {
        print();
        int mode = arrayWithRandomDigits[0];
        int maxCount = 0;
        for (int i = 0; i < arrayLenght; i++) {
            int value = arrayWithRandomDigits[i];
            int count = 1;
            for (int j = 0; j < arrayLenght; j++) {
                if (arrayWithRandomDigits[j] == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        System.out.println("\nMode = " + mode);
    }

    public void standartDeviation(){
        print();
        int elements;
        double sumElemets = 0;
        double mean = 0;
        for (int i = 0; i < arrayLenght; i++) {
            mean += arrayWithRandomDigits[i];
        }
        mean /= arrayLenght;
        for (int i = 0; i<arrayLenght; i++){
            elements = arrayWithRandomDigits[i];
            sumElemets = elements - mean;
        }
        double standartDeviation = Math.sqrt((sumElemets*sumElemets)/(arrayLenght-1));
        System.out.println("\nStandart Deviation = " + standartDeviation);
    }

    private void print(){
        for (int i = 0; i < arrayLenght; i++) {
            System.out.print(arrayWithRandomDigits[i] + " ");
        }
    }
}
