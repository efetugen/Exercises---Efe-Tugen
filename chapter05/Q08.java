package HW.chapter01.chapter05;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        int highestScore = 0;
        String highestScoreName = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        System.out.println("Enter each student’s name and score");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student: " + (i + 1) +
                    "\nName: ");
            String name = input.next();
            System.out.print("Score: ");
            int score = input.nextInt();

            if (score > highestScore) {
                highestScore = score;
                highestScoreName = name;
            }
        }

        System.out.println("Student with the highest score: " + highestScoreName);
    }
}
