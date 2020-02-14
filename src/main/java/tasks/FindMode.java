package tasks;

public class FindMode {
    public static int mode(int[] array) {
        int mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
    }

    public static void findMode(){
        int[] arr = {12, 123, 45, 65, 53, 23, 123, 45, 653, 23, 54, 12, 12};
        System.out.println(mode(arr));

    }
}
