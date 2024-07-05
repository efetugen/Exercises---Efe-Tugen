package HW.chapter01.chapter05;

public class Q18D {
    public static void main(String[] args) {
        System.out.println("Pattern D");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < 6 - i; k++) {
                System.out.print((k + 1) + " ");
            }
            System.out.println();
        }
    }
}
