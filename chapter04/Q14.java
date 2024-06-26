package HW.chapter01.chapter04;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch);

        if (ch >= 'A' && ch <= 'F' && ch != 'E') {
            System.out.print("The numeric value for grade " + ch + " is ");
            switch (ch) {
                case 'A' -> System.out.println(4);
                case 'B' -> System.out.println(3);
                case 'C' -> System.out.println(2);
                case 'D' -> System.out.println(1);
                case 'F' -> System.out.println(0);
            }
        } else {
            System.out.println(ch + " is an invalid input");
        }
    }

}
