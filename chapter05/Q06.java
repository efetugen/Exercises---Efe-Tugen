package HW.chapter01.chapter05;

public class Q06 {
    public static void main(String[] args) {
        final double MILES_TO_KM = 1.609;

        System.out.println("Miles      Kilometers   |   Kilometers      Miles");

        for (int m = 1, k = 20; m <= 10 && k <= 65; m++, k += 5) {
            System.out.printf("%-12d%9.3f", m, m * MILES_TO_KM);
            System.out.print("   |   ");
            System.out.printf("%-9d%12.3f\n", k, k / MILES_TO_KM);
        }
    }
}
