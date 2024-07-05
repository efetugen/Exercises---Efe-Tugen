package HW.chapter01.chapter05;

public class Q04 {
    public static void main(String[] args) {
        final double MILES_TO_KILOMETERS = 1.609;

        System.out.println("Miles        Kilometers");

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%-13d%-10.3f\n", i, MILES_TO_KILOMETERS * i);
        }
    }
}
