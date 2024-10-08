package HW.chapter01.chapter07;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The minimum number is " + min(numbers));
    }

    public static double min(double[] array) {
        double min = array[0];

        for (double i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

}
