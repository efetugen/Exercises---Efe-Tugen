package HW.chapter01.chapter02;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterWeight = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double startingTemp = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();

        double energyNeeded = waterWeight * (finalTemp - startingTemp) * 4184;

        System.out.println("The energy needed is " + energyNeeded);
    }
}
