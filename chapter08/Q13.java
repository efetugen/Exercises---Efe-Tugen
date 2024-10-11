package HW.chapter01.chapter08;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] matrix = new double[rows][columns];

        System.out.print("Enter the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        int[] location = locateLargest(matrix);

        System.out.println("The largest element is at (" + location[0] + "," + location[1] + ").");
    }

    public static int[] locateLargest(double[][] a) {
        int[] largest = new int[2];
        largest[0] = 0;
        largest[1] = 0;
        double max = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    largest[0] = i;
                    largest[1] = j;
                }
            }
        }

        return largest;
    }
}
