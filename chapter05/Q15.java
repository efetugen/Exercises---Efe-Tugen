package HW.chapter01.chapter05;

public class Q15 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 33; i <= 126; i++) {
            count++;
            if (count % 10 == 0)
                System.out.println((char) i + " ");
            else
                System.out.print((char) i + " ");
        }
    }
}
