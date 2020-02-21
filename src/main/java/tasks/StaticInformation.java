package tasks;

import java.util.Arrays;

class StaticInformation {

    private int[] arrayWithRandomDigits = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};
    private int arrayLenght = arrayWithRandomDigits.length;

    void mean() {
        print();
        double arithmeticMean = 0;
        for (int i = 0; i < arrayLenght; i++) {
            arithmeticMean += arrayWithRandomDigits[i];
        }
        arithmeticMean /= arrayLenght;
        System.out.println("\nMean = " + arithmeticMean);
    }

    void median() {
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

    void mode() {
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

    void standardDeviation() {
        print();
        int elements;
        double sumElements = 0;
        double mean = 0;
        for (int i = 0; i < arrayLenght; i++) {
            mean += arrayWithRandomDigits[i];
        }
        mean /= arrayLenght;
        for (int i = 0; i < arrayLenght; i++) {
            elements = arrayWithRandomDigits[i];
            sumElements = elements - mean;
        }
        double standardDeviation = Math.sqrt((sumElements * sumElements) / (arrayLenght - 1));
        System.out.println("\nStandard Deviation = " + String.format("%.2f", standardDeviation));
    }

    private void print() {
        for (int i = 0; i < arrayLenght; i++) {
            System.out.print(arrayWithRandomDigits[i] + " ");
        }
    }
}
