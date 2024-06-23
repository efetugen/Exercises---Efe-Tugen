package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("Is " + number + " divisible by 5 and 6? ");
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.print("Is 10 divisible by 5 or 6? ");
        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.print("Is 10 divisible by 5 or 6, but not both? ");
        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
