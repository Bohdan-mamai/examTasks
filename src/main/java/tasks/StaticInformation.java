package tasks;

import java.util.Arrays;

public class StaticInformation {

    int[] arrayWithRandomDigits = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};
    int arrayLenght = arrayWithRandomDigits.length;

    public double mean() {
        double aritmeticMean = 0;
        for (int i = 0; i < arrayLenght; i++) {
            aritmeticMean += arrayWithRandomDigits[i];
        }
        aritmeticMean /= arrayLenght;
        System.out.println("Mean = " + aritmeticMean);
        return aritmeticMean;
    }

    public void median(){
        Arrays.sort(arrayWithRandomDigits);
        double median;
        if (arrayLenght % 2 == 0) {
            median = ((double) arrayWithRandomDigits[arrayLenght / 2] + (double) arrayWithRandomDigits[arrayLenght / 2 - 1]) / 2;
        } else {
            median = arrayWithRandomDigits[arrayLenght / 2];
        }
        System.out.println("Median = " + median);
    }

    public void mode() {
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
        System.out.println("Mode = " + mode);
    }

    public void standartDeviation(){
        int elements;
        double sumElemets = 0;
        double mean = mean();
        for (int i = 0; i<arrayLenght; i++){
            elements = arrayWithRandomDigits[i];
            sumElemets = elements - mean;
        }
        double standartDeviation = Math.sqrt((sumElemets*sumElemets)/(arrayLenght-1));
        System.out.println(standartDeviation);
    }

}
