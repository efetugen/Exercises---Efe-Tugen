package HW.chapter01.chapter05;

public class Q05 {
    public static void main(String[] args) {
        final double POUNDS_PER_KG = 2.2;

        System.out.println("Kilograms    Pounds    |    Pounds    Kilograms");

        for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {
            System.out.printf("%-12d%7.1f", k, (k * POUNDS_PER_KG));
            System.out.print("    |    ");
            System.out.printf("%-9d%10.2f\n", p, (p / POUNDS_PER_KG));
        }
    }
}
