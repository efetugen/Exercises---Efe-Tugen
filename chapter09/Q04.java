package HW.chapter01.chapter09;

import java.util.Random;

public class Q04 {
    public static void main(String[] args) {
        Random random = new Random(1000);

        for (int i = 0; i <= 50; i++) {
            System.out.printf("%3d", random.nextInt(100));
        }
    }
}
