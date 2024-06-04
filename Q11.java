package HW.chapter01;

public class Q11 {
    public static void main(String[] args) {
        int currentPopulation = 312_032_486;
        int numberOfBirthsInOneYear = 31_536_000 / 7;
        int numberOfDeathsInOneYear = 31_536_000 / 13;
        int numberOfNewImmigrantInOneYear = 31_536_000 / 45;

        System.out.println(currentPopulation + numberOfBirthsInOneYear + numberOfNewImmigrantInOneYear - numberOfDeathsInOneYear);
        System.out.println(currentPopulation + 2 * numberOfBirthsInOneYear + 2 * numberOfNewImmigrantInOneYear - 2 * numberOfDeathsInOneYear);
        System.out.println(currentPopulation + 3 * numberOfBirthsInOneYear + 3 * numberOfNewImmigrantInOneYear - 3 * numberOfDeathsInOneYear);
        System.out.println(currentPopulation + 4 * numberOfBirthsInOneYear + 4 * numberOfNewImmigrantInOneYear - 4 * numberOfDeathsInOneYear);
        System.out.println(currentPopulation + 5 * numberOfBirthsInOneYear + 5 * numberOfNewImmigrantInOneYear - 5 * numberOfDeathsInOneYear);

    }
}
