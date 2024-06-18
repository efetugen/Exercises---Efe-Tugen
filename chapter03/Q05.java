package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int dayNo = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int dayPass = input.nextInt();

        int res = dayNo + dayPass;

        String dayNameToday = switch (dayNo) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 0 -> "Sunday";
            default -> throw new IllegalStateException("Unexpected value: " + res % 7);
        };

        String dayName = switch (res % 7) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 0 -> "Sunday";
            default -> throw new IllegalStateException("Unexpected value: " + res % 7);
        };

        System.out.println("Today is " + dayNameToday + " and the future day is " + dayName);
    }
}
