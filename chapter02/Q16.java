package HW.chapter01.chapter02;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = ((3.0 * Math.sqrt(3)) / 2.0) * (Math.pow(side, 2));

        System.out.println("The area of the hexagon is " + area);
    }
}
