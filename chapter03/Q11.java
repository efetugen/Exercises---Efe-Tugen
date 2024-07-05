package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter month and year as integer values: ");
        int month = input.nextInt();
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int daysInMonth;

        daysInMonth = switch (month) {
            case 1 -> 31;
            case 2 -> (isLeapYear) ? 29 : 28;
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };

        System.out.println("Number of days in the month is: " + daysInMonth);
    }
}
