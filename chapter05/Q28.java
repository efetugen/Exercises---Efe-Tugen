package HW.chapter01.chapter05;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter first day of the year: ");
        int firstDay = input.nextInt();

        String output;
        for (int month = 1; month <= 12; month++) {
            output = "";
            switch (month) {
                case 1:
                    output += "January ";
                    break;
                case 2:
                    output += "February ";
                    break;
                case 3:
                    output += "March ";
                    break;
                case 4:
                    output += "April ";
                    break;
                case 5:
                    output += "May ";
                    break;
                case 6:
                    output += "June ";
                    break;
                case 7:
                    output += "July ";
                    break;
                case 8:
                    output += "August ";
                    break;
                case 9:
                    output += "September ";
                    break;
                case 10:
                    output += "October ";
                    break;
                case 11:
                    output += "November ";
                    break;
                case 12:
                    output += "December ";
                    break;
            }

            output += "1, " + year + " is ";

            firstDay %= 7;

            switch (firstDay) {
                case 0:
                    System.out.println(output + "Sunday");
                    break;
                case 1:
                    System.out.println(output + "Monday");
                    break;
                case 2:
                    System.out.println(output + "Tuesday");
                    break;
                case 3:
                    System.out.println(output + "Wednesday");
                    break;
                case 4:
                    System.out.println(output + "Thursday");
                    break;
                case 5:
                    System.out.println(output + "Friday");
                    break;
                case 6:
                    System.out.println(output + "Saturday");
                    break;
            }
            
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12)
                firstDay += 31;
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                firstDay += 30;
            else {
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                    firstDay += 29;
                else
                    firstDay += 28;
            }
        }
    }
}
