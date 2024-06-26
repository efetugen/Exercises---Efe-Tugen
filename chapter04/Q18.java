package HW.chapter01.chapter04;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String s = input.nextLine();

        char m = Character.toUpperCase(s.charAt(0));
        char year = s.charAt(1);


        switch (m) {
            case 'M' -> System.out.print("Mathematics ");
            case 'C' -> System.out.print("Computer Science ");
            case 'I' -> System.out.print("Information Technology ");
            default -> System.out.print("Invalid input");
        }

        switch (year) {
            case '1' -> System.out.print("Freshman");
            case '2' -> System.out.print("Sophomore");
            case '3' -> System.out.print("Junior");
            case '4' -> System.out.print("Senior");
            default -> System.out.print("Invalid input");
        }
    }
}
