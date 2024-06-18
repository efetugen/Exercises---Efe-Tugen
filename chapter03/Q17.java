package HW.chapter01.chapter03;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();
        int comp = (int) (Math.random() * 3);

        if (comp == 0) {
            System.out.print("The computer is scissor. ");
            if (user == 0) {
                System.out.println("You are scissor too. It is a draw");
            } else if (user == 1) {
                System.out.println("You are rock. You won");
            } else if (user == 2) {
                System.out.println("You are paper. You lost");
            }
        } else if (comp == 1) {
            System.out.print("The computer is rock. ");
            if (user == 0) {
                System.out.println("You are scissor. You lost");
            } else if (user == 1) {
                System.out.println("You are rock too. It is a draw");
            } else if (user == 2) {
                System.out.println("You are paper. You won");
            }
        } else {
            System.out.print("The computer is paper. ");
            if (user == 0) {
                System.out.println("You are scissor. You won");
            } else if (user == 1) {
                System.out.println("You are rock. You lost");
            } else if (user == 2) {
                System.out.println("You are paper too. It is a draw");
            }
        }
    }
}
