package HW.chapter01.chapter02;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int currentPopulation = 312_032_486;
        double numberOfBirthsInOneYear = 31_536_000 / 7.0;
        double numberOfDeathsInOneYear = 31_536_000 / 13.0;
        double numberOfNewImmigrantInOneYear = 31_536_000 / 45.0;

        int newPopulation = (int) (currentPopulation + years * numberOfBirthsInOneYear + years * numberOfNewImmigrantInOneYear
                - years * numberOfDeathsInOneYear);

        System.out.println("The population in " + years + "years is " + newPopulation);
    }
}
