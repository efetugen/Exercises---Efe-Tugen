package HW.chapter01.chapter06;

public class Q28 {
    public static void main(String[] args) {
        System.out.printf("%-8s%-10s%n", "p", "2^p - 1");
        System.out.println("--------------------");

        for (int p = 2; p <= 31; p++) {
            long mersennePrime = (long) Math.pow(2, p) - 1;
            if (isPrime(mersennePrime)) {
                System.out.printf("%-8d%-10d%n", p, mersennePrime);
            }
        }
    }

    public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
