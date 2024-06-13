package HW.chapter01.chapter02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kg = pounds / 0.454;
        System.out.println(pounds + " pounds is " + kg + " kilograms");
    }
}
