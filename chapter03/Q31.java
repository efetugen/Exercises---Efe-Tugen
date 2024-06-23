package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convert = input.nextInt();

        System.out.print("Enter the dollar amount: ");
        int amount = input.nextInt();

        double res;

        if (convert == 0) {
            res = amount * rate;
            System.out.println("$" + amount + " is " + res + " yuan");
        } else {
            res = amount / rate;
            System.out.println(amount + " yuan is $" + res);
        }
    }
}
