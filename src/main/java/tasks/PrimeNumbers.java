package tasks;

class PrimeNumbers {
    private long i = 10;
    private long j = 50000;

    void primeNumbers() {

        System.out.println("Prime numbers from 1 to " + j + ":");

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(5);
        System.out.println(7);

        for (int k = (int) i; k < j; k++) {
            if (k % 2 != 0 && k % 3 != 0 && k % 5 != 0 && k % 7 != 0) {
                System.out.println(k);
            }
        }
    }
}
