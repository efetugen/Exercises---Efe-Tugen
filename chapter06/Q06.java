package HW.chapter01.chapter06;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numOfRows = input.nextInt();

        displayPattern(numOfRows);
    }

    public static void displayPattern(int n) {
        int temp = n - 1;
        for (int r = 1; r <= n; r++) {
            for (int p = 0; p < temp; p++) {
                System.out.print("  ");
            }
            for (int i = r; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            temp--;
        }
    }
}
