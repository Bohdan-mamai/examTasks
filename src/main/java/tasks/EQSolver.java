package tasks;

import java.text.DecimalFormat;

public class EQSolver {
    private double a = 5;
    private double b = 8;
    private double c = 1;
    private double discriminant = (b * b - 4 * a * c);
    private double oneRoot = (-b / 2*a);

    private double x1;
    private double x2;

    DecimalFormat df = new DecimalFormat("#.##");

    public void calculateSqrt() {
        if (discriminant < 0 ){
            System.out.println("There is no solution");
        } else if ( discriminant == 0.0){
            System.out.println("There is only one solution");
            System.out.println(oneRoot);
        } else {
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println(df.format(x1));
            System.out.println(df.format(x2));
        }
    }
}
