package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int temp = number;
        int digit1 = temp % 10;
        temp /= 10;
        int digit2 = temp % 10;
        temp /= 10;
        int digit3 = temp % 10;

        if (digit1 == digit3) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}
