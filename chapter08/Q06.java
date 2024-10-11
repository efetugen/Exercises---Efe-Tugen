package HW.chapter01.chapter08;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix1: ");
        double[][] matrix1 = new double[3][3];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                matrix1[row][col] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");
        double[][] matrix2 = new double[3][3];
        for (int row = 0; row < matrix2.length; row++) {
            for (int col = 0; col < matrix2[row].length; col++) {
                matrix2[row][col] = input.nextDouble();
            }
        }

        double[][] matrix3 = multiplyMatrix(matrix1, matrix2);

        print(matrix1, matrix2, matrix3);
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];
        for (int row = 0; row < c.length; row++) {
            for (int col = 0; col < c[row].length; col++) {
                for (int k = 0; k < c.length; k++) {
                    c[row][col] += a[row][k] * b[k][col];
                }
            }
        }
        return c;
    }

    public static void print(double[][] m, int r) {
        for (int j = 0; j < m[r].length; j++) {
            System.out.print(m[r][j] + " ");
        }
    }

    public static void print(double[][] m1, double[][] m2, double[][] m3) {
        System.out.println("The matrices are added as follows");

        for (int i = 0; i < 3; i++) {
            print(m1, i);
            System.out.print((i == 1 ? "  +  " : "     "));
            print(m2, i);
            System.out.print((i == 1 ? "  =  " : "     "));
            print(m3, i);
            System.out.println();
        }
    }
}
