package HW.chapter01.chapter04;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a dec value (0 to 15): ");
        int dec = input.nextInt();

        if (dec >= 0 && dec <= 9)
            System.out.println("The hex value is " + dec);
        else if (dec >= 10 && dec <= 15)
            System.out.println("The hex value is " + (char) (dec + 'A' - 10));
        else
            System.out.println(dec + " is an invalid input");
    }
}
