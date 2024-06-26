package HW.chapter01.chapter04;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        if (Character.isLetter(ch)) {
            switch (Character.toUpperCase(ch)) {
                case 'A', 'E', 'I', 'O', 'U' -> System.out.println(ch + " is a vowel");
                default -> System.out.println(ch + " is a consonant");
            }
        } else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
