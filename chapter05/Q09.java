package HW.chapter01.chapter05;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        int highestScore = 0;
        int secondHighestScore = 0;
        int score = 0;
        String highestScoreName = "";
        String secondHighestScoreName = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        System.out.println("Enter each student’s name and score");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student: " + (i + 1) +
                    "\n   Name: ");
            String name = input.next();
            System.out.print("   Score: ");
            score = input.nextInt();

            if (i == 0) {
                highestScore = score;
                highestScoreName = name;
            } else if (i == 1 && score > highestScore) {
                secondHighestScore = highestScore;
                highestScore = score;
                secondHighestScoreName = highestScoreName;
                highestScoreName = name;
            } else if (i == 1) {
                secondHighestScore = score;
                secondHighestScoreName = name;
            } else if (i > 1 && score > highestScore && score > secondHighestScore) {
                secondHighestScore = highestScore;
                secondHighestScoreName = highestScoreName;
                highestScore = score;
                highestScoreName = name;
            } else if (i > 1 && score > secondHighestScore) {
                secondHighestScoreName = name;
                secondHighestScore = score;
            }
        }

        System.out.println(
                "Higest scoring student: " + highestScoreName +
                        "\nSecond Higest scoring student: " + secondHighestScoreName);
    }
}
