package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Guess if it is heads or tails (0 = heads, 1 = tails): ");
        int guess = input.nextInt();

        int number = (int) Math.round(Math.random());

        if (number == guess) {
            System.out.println("You guessed correct");
        } else {
            System.out.println("You guessed false");
        }
    }
}
