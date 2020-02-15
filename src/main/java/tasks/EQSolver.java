package tasks;

public class EQSolver {
    double a = 5;
    double b = 8;
    double c = 1;
    double discriminant = (b * b - 4 * a * c);
    double oneRoot = (-b / 2*a);

    double x1;
    double x2;

    public void calculateSqrt() {
        if (discriminant < 0 ){
            System.out.println("There is no solution");
        } else if ( discriminant == 0.0){
            System.out.println("There is only one solution");
            System.out.println(oneRoot);
        } else {
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
