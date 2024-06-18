package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temp = input.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChillIndex = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) +
                (0.4275 * temp * Math.pow(windSpeed, 0.16));

        if (temp < -58 || temp > 41) {
            System.out.println("Invalid temperature");
        } else if (windSpeed < 2) {
            System.out.println("Invalid wind speed");
        } else {
            System.out.println("The wind chill index is " + windChillIndex);
        }
    }
}
