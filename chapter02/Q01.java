package HW.chapter01.chapter02;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Celcius:");
        double celcius = input.nextDouble();

        double fahreneit = ((double) 9 / 5) * celcius + 32;
        System.out.println(celcius + " Celsius is " + fahreneit + " Fahrenheit");
    }
}
