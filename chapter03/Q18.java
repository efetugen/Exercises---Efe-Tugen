package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of package in pounds: ");
        double weight = input.nextDouble();

        double cost;
        if (weight > 0 && weight <= 1) {
            cost = 3.5;
            System.out.println("Cost of shipping is: " + cost);
        } else if (weight > 1 && weight <= 3) {
            cost = 5.5;
            System.out.println("Cost of shipping is: " + cost);
        } else if (weight > 3 && weight <= 10) {
            cost = 8.5;
            System.out.println("Cost of shipping is: " + cost);
        } else if (weight > 10 && weight <= 20) {
            cost = 10.5;
            System.out.println("Cost of shipping is: " + cost);
        } else if (weight > 50) {
            System.out.println("the package cannot be shipped.");
        }
    }
}
