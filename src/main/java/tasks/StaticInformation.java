package tasks;

import java.util.Arrays;

public class StaticInformation {
    public static double mean(int[] array) {
        double aritmeticMean = 0;
        for (int i = 0; i < array.length; i++) {
            aritmeticMean += array[i];
        }
        aritmeticMean /= array.length;
        return aritmeticMean;
    }

    public static double median(int[] array){
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0) {
            median = ((double) array[array.length / 2] + (double) array[array.length / 2 - 1]) / 2;
        } else {
            median = array[array.length / 2];
        }
        return median;
    }

    public static void initArray() {
        int[] arrayWithRandomDigits = {123, 214, 354, 324, 464, 2124, 12, 154, 768, 235};
        for (int i = 0; i < arrayWithRandomDigits.length; i++) {
            System.out.print(" " + arrayWithRandomDigits[i]);
        }
        System.out.println("\n Mean: " + mean(arrayWithRandomDigits));
        System.out.println("\n Median: " + median(arrayWithRandomDigits));
    }
}
