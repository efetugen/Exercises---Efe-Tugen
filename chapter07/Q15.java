package HW.chapter01.chapter07;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten number: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinctNumbers = eliminateDuplicates(numbers);


        System.out.print("The distinct numbers are:");
        for (int a : distinctNumbers) {
            if (a > 0) {
                System.out.print(" " + a);
            }
        }

        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int i = 0;

        for (int a : list) {
            if (linearSearch(distinctList, a) == -1) {
                distinctList[i] = a;
                i++;
            }
        }

        return distinctList;
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }

        return -1;
    }
}
