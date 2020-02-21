package tasks;

class BubbleSort {

    private int[] data = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};

    void bubbleSortAlgorithmAscending() {
        print();
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println("\nBubble Sort Algorithm Ascending");
        System.out.print("Output array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    void bubbleSortAlgorithmDescending() {
        print();
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] < data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.println("\nBubble Sort Algorithm Descending");
        System.out.print("Output array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    private void print() {
        System.out.print("Initial array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

}
