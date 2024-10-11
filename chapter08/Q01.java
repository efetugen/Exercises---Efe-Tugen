package HW.chapter01.chapter08;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }

        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println("Sum of the elements at column " + col + " is " + sumColumn(matrix, col));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }
}
