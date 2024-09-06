package HW.chapter01.chapter07;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The numbers in reverse order are:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}
