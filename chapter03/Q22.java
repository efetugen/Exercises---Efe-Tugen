package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        int x = input.nextInt();
        int y = input.nextInt();

        int x1 = 0;
        int y1 = 0;

        double distance = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
        boolean isInCircle;

        if (distance > 10) {
            isInCircle = false;
            System.out.println("Point (" + x + ".0, " + y + ".0) is not in the circle");
        } else {
            isInCircle = true;
            System.out.println("Point (" + x + ".0, " + y + ".0) is in the circle");
        }
    }
}
