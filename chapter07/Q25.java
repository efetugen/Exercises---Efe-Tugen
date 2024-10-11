package HW.chapter01.chapter07;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b and c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double[] eqn = {a, b, c};
        double[] roots = new double[2];

        int numberOfRoots = solveQuadratic(eqn, roots);

        if (numberOfRoots == 2) {
            System.out.println("The equation has two real roots: " + roots[0] + " and " + roots[1]);
        } else if (numberOfRoots == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return 2;
        } else if (discriminant == 0) {
            roots[0] = -b / (2 * a);
            return 1;
        } else {
            return 0;
        }
    }
}
