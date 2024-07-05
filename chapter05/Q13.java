package HW.chapter01.chapter05;

public class Q13 {
    public static void main(String[] args) {
        int n = 0;

        while (Math.pow(n + 1, 3) < 12000) {
            n++;
        }

        System.out.println(n);
    }
}
