package HW.chapter01.chapter07;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        String[] students = new String[input.nextInt()];
        int[] scores = new int[students.length];

        System.out.println("Enter the name a score for each student:");
        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = input.next();

            System.out.print("Score: ");
            scores[i] = input.nextInt();
        }

        sortDecreasing(students, scores);

        for (String a : students) {
            System.out.println(a);
        }
    }

    public static void sortDecreasing(String[] strs, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int maxIndex = i;
            String temp;


            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                temp = strs[i];
                strs[i] = strs[maxIndex];
                strs[maxIndex] = temp;

                nums[maxIndex] = nums[i];
                nums[i] = max;
            }
        }
    }
}
