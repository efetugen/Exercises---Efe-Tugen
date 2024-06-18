package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");

        if (numberOfOneDollars > 1) {
            System.out.println("    " + numberOfOneDollars + " dollars");
        } else {
            System.out.println("    " + numberOfOneDollars + " dollar");
        }

        if (numberOfQuarters > 1) {
            System.out.println("    " + numberOfQuarters + " quarters ");
        } else {
            System.out.println("    " + numberOfQuarters + " quarter");
        }

        if (numberOfDimes > 1) {
            System.out.println("    " + numberOfDimes + " dimes");
        } else {
            System.out.println("    " + numberOfDimes + " dime");
        }

        if (numberOfNickels > 1) {
            System.out.println("    " + numberOfNickels + " nickels");
        } else {
            System.out.println("    " + numberOfNickels + " nickel");
        }

        if (numberOfPennies > 1) {
            System.out.println("    " + numberOfPennies + " pennies ");
        } else {
            System.out.println("    " + numberOfPennies + " penny");
        }

    }
}
