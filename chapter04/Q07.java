package HW.chapter01.chapter04;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        double x1 = radius * Math.cos(Math.toRadians(72));
        double y1 = radius * Math.sin(Math.toRadians(72));
        double x2 = radius * Math.cos(Math.toRadians(0));
        double y2 = radius * Math.sin(Math.toRadians(0));
        double x3 = radius * Math.cos(Math.toRadians(-72));
        double y3 = radius * Math.sin(Math.toRadians(-72));
        double x4 = radius * Math.cos(Math.toRadians(-144));
        double y4 = radius * Math.sin(Math.toRadians(-144));
        double x5 = radius * Math.cos(Math.toRadians(-216));
        double y5 = radius * Math.sin(Math.toRadians(-216));

        System.out.println("The coordinates of five points on the pentagon are" +
                "\n(" + x1 + ", " + y1 + ")" +
                "\n(" + x2 + ", " + y2 + ")" +
                "\n(" + x3 + ", " + y3 + ")" +
                "\n(" + x4 + ", " + y4 + ")" +
                "\n(" + x5 + ", " + y5 + ")");
    }
}
