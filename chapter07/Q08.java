package HW.chapter01.chapter07;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] nums = new double[10];

        System.out.print("Enter ten values of double type: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextDouble();
        }

        System.out.println("The average value is: " + average(nums));
    }

    public static int average(int[] array) {
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average / array.length;
    }

    public static double average(double[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average / array.length;
    }
}
