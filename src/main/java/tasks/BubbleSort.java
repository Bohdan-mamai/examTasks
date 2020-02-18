package tasks;

public class BubbleSort {

    int[] data = {206,430,73,30,293,322,42,36,447,229};

    public void bubbleSortAlgorithmAscending(){
        print();
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        System.out.println("\nBubble Sort Algorithm Ascending");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "; ");
        }
    }

    public void bubbleSortAlgorithmDescending(){
        print();
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j]<data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        System.out.println("\nBubble Sort Algorithm Descending");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "; ");
        }
    }

    private void print(){
        System.out.print("Initial array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

}
