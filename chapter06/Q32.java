package HW.chapter01.chapter06;

import java.util.Random;

public class Q32 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            if (playCraps() == 1)
                count++;
        }
        System.out.println("Number of winning games: " + count);
    }

    public static int playCraps() {
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
        return point;
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
