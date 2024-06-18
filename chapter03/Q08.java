package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter three integer values: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        int mid = num1 + num2 + num3 - max - min;
        System.out.println("In order " + min + " " + mid + " " + max);
    }
}
