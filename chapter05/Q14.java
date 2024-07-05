package HW.chapter01.chapter05;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int greatestCommonDivider = n1 < n2 ? n1 : n2;


        while (n1 % greatestCommonDivider != 0 || n2 % greatestCommonDivider != 0) {
            greatestCommonDivider--;
        }

        // Display result
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + greatestCommonDivider);
    }
}
