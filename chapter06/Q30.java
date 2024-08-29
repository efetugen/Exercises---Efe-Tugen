package HW.chapter01.chapter06;

import java.util.Random;

public class Q30 {
    public static void main(String[] args) {
        playCraps();
    }

    public static void playCraps() {
        int point = rollDice();

        if (point == 7 || point == 11) {
            System.out.println("You win");
        } else if (point == 2 || point == 3 || point == 12) {
            System.out.println("You lose");
        } else {
            System.out.println("point is " + point);
            int newRoll;
            do {
                newRoll = rollDice();
            } while (newRoll != point && newRoll != 7);

            if (newRoll == point) {
                System.out.println("You win");
            } else {
                System.out.println("You lose");
            }
        }
    }

    public static int rollDice() {
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int sum = die1 + die2;

        System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
        return sum;
    }
}
