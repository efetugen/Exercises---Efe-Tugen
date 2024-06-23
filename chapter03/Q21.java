package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter month: 1-12: ");
        int m = input.nextInt();

        if (m == 1) {
            m = 13;
            year -= 1;
        } else if (m == 2) {
            m = 14;
            year -= 1;
        }

        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();

        int j = year / 100;
        int k = year % 100;

        int h = (int) ((q + (26 * (m + 1)) / 10.0 + k + k / 4.0 + j / 4.0 + 5 * j) % 7);

        String dayOfWeek = switch (h) {
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> throw new IllegalStateException("Unexpected value: " + h);
        };

        System.out.println("Day of the week is " + dayOfWeek);
    }
}
