package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        int x = input.nextInt();
        int y = input.nextInt();

        if (x <= 5.0 && y <= 2.5) {
            System.out.println("Point (" + x + ".0, " + y + ".0) is in the rectangle");
        } else {
            System.out.println("Point (" + x + ".0, " + y + ".0) is not in the rectangle");
        }
    }
}
