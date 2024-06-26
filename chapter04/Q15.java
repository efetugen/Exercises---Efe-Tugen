package HW.chapter01.chapter04;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        ch = Character.toUpperCase(ch);
        int number = 0;

        if (ch >= 'A' && ch <= 'Z') {
            switch (ch) {
                case 'A', 'B', 'C' -> number = 2;
                case 'D', 'E', 'F' -> number = 3;
                case 'G', 'H', 'I' -> number = 4;
                case 'J', 'K', 'L' -> number = 5;
                case 'M', 'N', 'O' -> number = 6;
                case 'P', 'Q', 'R', 'S' -> number = 7;
                case 'T', 'U', 'V' -> number = 8;
                case 'W', 'X', 'Y', 'Z' -> number = 9;
            }
            System.out.println("The corresponding number is " + number);
        } else {
            System.out.println(s + " is an invalid input");
        }

    }
}
