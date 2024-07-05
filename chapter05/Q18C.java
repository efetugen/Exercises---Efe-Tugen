package HW.chapter01.chapter05;

public class Q18C {
    public static void main(String[] args) {
        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int j = 6 - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
