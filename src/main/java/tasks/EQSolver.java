package tasks;

import java.text.DecimalFormat;

class EQSolver {

    private DecimalFormat df = new DecimalFormat("#.##");
    private double a = 2;
    private double b = 10;
    private double c = 6;
    private double discriminant = (b * b - 4 * a * c);
    private double oneRoot = (-b / 2 * a);
    private double x1;
    private double x2;

    void calculateSqrt() {
        System.out.println("a = " + a + "; " + "b = " + b + "; " + "c = " + c);
        if (discriminant < 0) {
            System.out.println("There is no solution");
        } else if (discriminant == 0.0) {
            System.out.println("There is only one solution");
            System.out.println(oneRoot);
        } else {
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + df.format(x1));
            System.out.println("x2 = " + df.format(x2));
        }
    }

}
