package HW.chapter01.chapter06;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number: ");
        long number = input.nextLong();

        System.out.println(number + " is " + (isValid(number) ? "valid" : "invalid"));
    }

    public static boolean isValid(long number) {
        boolean valid = (getSize(number) >= 13 && getSize(number) <= 16) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                        prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

        return valid;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }

    public static int getDigit(int number) {
        if (number < 9) {
            return number;
        }
        return number / 10 + number % 10;
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }
        return sum;
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    public static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            return Long.parseLong(Long.toString(number).substring(0, k));
        }
        return number;
    }
}
