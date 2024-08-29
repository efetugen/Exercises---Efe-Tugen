package HW.chapter01.chapter05;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        int digit1, digit2;
        digit1 = (int) (Math.random() * 10);

        do {
            digit2 = (int) (Math.random() * 10);
        } while (digit1 == digit2);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        int lotteryDigit1 = guess / 10;
        int lotteryDigit2 = guess % 10;

        System.out.println("The lottery number is " + digit1 + digit2);

        // Check the guess
        if (digit1 == lotteryDigit1 && digit2 == lotteryDigit2)
            System.out.println("Exact match: you win $10,000");
        else if (digit2 == lotteryDigit1 && digit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (digit1 == lotteryDigit1
                || digit1 == lotteryDigit2
                || digit2 == lotteryDigit1
                || digit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
