package HW.chapter01.chapter06;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        System.out.println((isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }

        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            }
        }
        if (numberOfDigits >= 2) {
            return true;
        }
        return true;
    }
}
