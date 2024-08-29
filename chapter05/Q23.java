package HW.chapter01.chapter05;

public class Q23 {
    public static void main(String[] args) {
        double n = 50000.0;
        double resRightToLeft = 0.0;

        for (double i = n; i > 0; i--) {
            resRightToLeft += 1 / i;
        }

        double sumLeftToRight = 0;

        for (double i = 1; i <= n; i++) {
            sumLeftToRight += 1 / i;
        }

        double diff = resRightToLeft - sumLeftToRight;

        System.out.println(diff);
    }
}
