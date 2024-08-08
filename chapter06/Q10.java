package HW.chapter01.chapter06;

public class Q10 {
    public static void main(String[] args) {
        int numberOfPrimes = 0;

        for (int i = 1; i < 1000; i++) {
            if (PrimeNumberMethod.isPrime(i))
                numberOfPrimes++;
        }

        System.out.println("The number of prime numbers less than 10000: " + numberOfPrimes);
    }

    public class PrimeNumberMethod {
        public static void main(String[] args) {
            System.out.println("The first 50 prime numbers are \n");
            printPrimeNumbers(50);
        }

        public static void printPrimeNumbers(int numberOfPrimes) {
            int count = 0;
            int number = 2;

            while (count < numberOfPrimes) {

                if (isPrime(number)) {
                    count++;
                    if (count % 10 == 0) {
                        System.out.printf("%-5s\n", number);
                    } else
                        System.out.printf("%-5s", number);
                }

                number++;
            }
        }

        public static boolean isPrime(int number) {
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
