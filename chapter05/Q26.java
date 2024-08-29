package HW.chapter01.chapter05;

public class Q26 {
    public static void main(String[] args) {
        double e = 0.0, value = 10000.0;

        for (double i = 1; i <= value; i++) {
            double var = i;
            for (double k = i - 1; k >= 1; k--) {
                var *= k;
            }
            e += 1 / var;
        }

        System.out.println(e);

        e = 0.0;
        value = 20000.0;
        for (double i = 1; i <= value; i++) {
            double var = i;
            for (double k = i - 1; k >= 1; k--) {
                var *= k;
            }
            e += 1 / var;
        }

        System.out.println(e);

        e = 0.0;
        value = 100000.0;
        for (double i = 1; i <= value; i++) {
            double var = i;
            for (double k = i - 1; k >= 1; k--) {
                var *= k;
            }
            e += 1 / var;
        }

        System.out.println(e);
    }
}
