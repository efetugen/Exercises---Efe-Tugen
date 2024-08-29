package HW.chapter01.chapter05;

public class Q24 {
    public static void main(String[] args) {
        double res = 0;

        for (double i = 1.0; i <= 97.0; i += 2) {
            res = i / (i + 2);
        }
        System.out.println(res);
    }
}
