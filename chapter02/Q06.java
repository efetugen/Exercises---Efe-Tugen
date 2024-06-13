package HW.chapter01.chapter02;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of the digits is " + sum);
    }
}
