package HW.chapter01.chapter07;

public class Q06 {
    public static void main(String[] args) {
        int[] primes = new int[50];
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are \n");

        while (count < 50) {
            boolean isPrime = true;

            for (int i = 0; i < count && primes[i] <= Math.sqrt(number); i++) {
                if (number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes[count] = number;
                count++;

                if (count % 10 == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            
            number++;
        }
    }

}
