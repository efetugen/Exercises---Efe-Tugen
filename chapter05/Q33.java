package HW.chapter01.chapter05;

public class Q33 {
    public static void main(String[] args) {
        System.out.println("The four perfect number lower than 10000 is:");

        int sum;

        for (int i = 1; i <= 10000; i++) {
            sum = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (i == sum) {
                System.out.printf("%20d\n", i);
            }
        }

    }
}
