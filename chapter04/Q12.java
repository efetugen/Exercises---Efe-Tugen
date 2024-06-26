package HW.chapter01.chapter04;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        if ((ch >= 'A' && ch <= 'F') || (ch >= 0 && ch <= 9)) {
            System.out.print("The binary value is ");
            switch (ch) {
                case 0 -> System.out.println(0000);
                case 1 -> System.out.println(0001);
                case 2 -> System.out.println(0010);
                case 3 -> System.out.println(0011);
                case 4 -> System.out.println(0100);
                case 5 -> System.out.println(0101);
                case 6 -> System.out.println(0110);
                case 7 -> System.out.println(0111);
                case 8 -> System.out.println(1000);
                case 9 -> System.out.println(1001);
                case 'A' -> System.out.println(1010);
                case 'B' -> System.out.println(1011);
                case 'C' -> System.out.println(1100);
                case 'D' -> System.out.println(1101);
                case 'E' -> System.out.println(1110);
                case 'F' -> System.out.println(1111);
            }
        } else {
            System.out.println(ch + " is and invalid input");
        }
    }
}
