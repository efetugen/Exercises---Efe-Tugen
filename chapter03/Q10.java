package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // 3. Prompt the student to answer �what is number1 � number2?�
        System.out.print
                ("What is " + number1 + " - " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        // 4. Grade the answer and display the result
        if (number1 - number2 == answer)
            System.out.println("You are correct!");
        else
            System.out.println("Your answer is wrong.\n" + number1 + " - "
                    + number2 + " should be " + (number1 - number2));

        int number3 = (int) (Math.random() * 100);
        int number4 = (int) (Math.random() * 100);

        if (number3 < number4) {
            int temp = number3;
            number3 = number4;
            number4 = temp;
        }

        System.out.print
                ("What is " + number3 + " - " + number4 + "? ");
        Scanner input1 = new Scanner(System.in);
        int answer1 = input1.nextInt();

        if (number3 - number4 == answer1)
            System.out.println("You are correct!");
        else
            System.out.println("Your answer is wrong.\n" + number3 + " - "
                    + number4 + " should be " + (number3 - number4));
    }
}
