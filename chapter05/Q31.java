package HW.chapter01.chapter05;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        double value = input.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double percentage = input.nextDouble();

        System.out.print("Enter number of months: ");
        int months = input.nextInt();

        double monthlyPercentage = percentage / 1200;

        System.out.println("Month   CD Value");
        for (int i = 1; i <= months; i++) {
            value += monthlyPercentage * value;
            System.out.printf("%-7d%.2f\n", i, value);
        }
    }
}
