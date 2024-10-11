package HW.chapter01.chapter08;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int row = input.nextInt();
        int col = row;
        int[][] m = new int[row][col];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 2);
            }
        }


    }
}
