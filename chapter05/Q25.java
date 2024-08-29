package HW.chapter01.chapter05;

public class Q25 {
    public static void main(String[] args) {
        double sum = 0;
        double val = 10000;

        for (double i = 1; i <= (val * 2 - 1); i += 2) {
            sum += 1 / i;
            i += 2;
            sum -= 1 / i;
        }
        double pi = 4 * sum;

        System.out.println(pi);

        sum = 0;
        val = 20000;

        for (double i = 1; i <= (val * 2 - 1); i += 2) {
            sum += 1 / i;
            i += 2;
            sum -= 1 / i;
        }
        pi = 4 * sum;

        System.out.println(pi);

        sum = 0;
        val = 100000;
        for (double i = 1; i <= (val * 2 - 1); i += 2) {
            sum += 1 / i;
            i += 2;
            sum -= 1 / i;
        }
        pi = 4 * sum;
        System.out.println(pi);

        
    }
}
