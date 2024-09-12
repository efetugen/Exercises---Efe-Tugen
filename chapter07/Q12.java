package HW.chapter01.chapter07;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        reverse(numbers);

        for (int a : numbers) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] a) {
        int temp = 0;
        for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
