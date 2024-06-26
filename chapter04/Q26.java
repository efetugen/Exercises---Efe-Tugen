package HW.chapter01.chapter04;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        String amount = input.nextLine();

        String numberOfOneDollars = amount.substring(0, '.');

        int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

        int numberOfQuarters = cents / 25;
        cents %= 25;

        int numberOfDimes = cents / 10;
        cents %= 10;

        int numberOfNickels = cents / 5;
        cents %= 5;

        int numberOfPennies = cents;
        
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}
