package HW.chapter01.chapter07;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter five numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The greatest common divisor is " + gcd(numbers));
    }

    public static int gcd(int... numbers) {
        int gcd = 1;
        boolean isDivisor;

        for (int i = 2; i < min(numbers); i++) {
            isDivisor = true;

            for (int a : numbers) {
                if (a % i != 0)
                    isDivisor = false;
            }
            if (isDivisor)
                gcd = i;
        }

        return gcd;
    }

    public static int min(int... numbers) {
        int min = numbers[0];

        for (int a : numbers) {
            if (a < min) {
                min = a;
            }
        }

        return min;
    }
}
