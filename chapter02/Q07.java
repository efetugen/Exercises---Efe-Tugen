package HW.chapter01.chapter02;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int days = (minutes / 1440) % 365;
        int years = minutes / 525600;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
