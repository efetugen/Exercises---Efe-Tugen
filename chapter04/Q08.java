package HW.chapter01.chapter04;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        System.out.println("The Unicode for the character " + s + " is " + (int) ch);
    }
}
