package HW.chapter01.chapter04;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        String month = input.next();

        int daysOfMonth = 0;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case "Jan" -> daysOfMonth = 31;
            case "Feb" -> {
                if (isLeapYear) {
                    daysOfMonth = 29;
                } else {
                    daysOfMonth = 28;
                }
            }
            case "Mar" -> daysOfMonth = 31;
            case "Apr" -> daysOfMonth = 30;
            case "May" -> daysOfMonth = 31;
            case "Jun" -> daysOfMonth = 30;
            case "Jul" -> daysOfMonth = 31;
            case "Aug" -> daysOfMonth = 31;
            case "Sep" -> daysOfMonth = 30;
            case "Oct" -> daysOfMonth = 31;
            case "Nov" -> daysOfMonth = 30;
            case "Dec" -> daysOfMonth = 31;
        }

        System.out.println(month + " " + year + " has " + daysOfMonth + " days");
    }
}
