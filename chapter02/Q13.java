package HW.chapter01.chapter02;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        int amount = input.nextInt();

        double monthlyInterestRate = 0.00417;

        double endAmount = amount * (1 + monthlyInterestRate);
        endAmount = (amount + endAmount) * (1 + monthlyInterestRate);
        endAmount = (amount + endAmount) * (1 + monthlyInterestRate);
        endAmount = (amount + endAmount) * (1 + monthlyInterestRate);
        endAmount = (amount + endAmount) * (1 + monthlyInterestRate);
        endAmount = (amount + endAmount) * (1 + monthlyInterestRate);

        System.out.println("After the sixth month, the account value is $" + endAmount);
    }
}
