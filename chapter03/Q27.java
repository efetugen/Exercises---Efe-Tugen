package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double intersectionX = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersectionY = (-y * (200 * 100)) / (-y * 200 - x * 100);

        System.out.print("The point ");
        if (x > intersectionX || y > intersectionY) {
            System.out.print("is not in the triangle");
        } else {
            System.out.print("is in the triangle");
        }
    }
}
