package HW.chapter01.chapter05;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter number of months: ");
        int months = input.nextInt();

        double monthlyInterestRate = rate / 1200;

        double sum = 0;
        for (int i = 1; i <= months; i++) {
            sum = (amount + sum) * (1 + monthlyInterestRate);
        }

        System.out.println("Amount in savings account after " + months + " months: " + sum);
    }
}
