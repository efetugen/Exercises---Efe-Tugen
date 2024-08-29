package HW.chapter01.chapter05;

public class Q27 {
    public static void main(String[] args) {
        int count = 0;
        for (int year = 101; year <= 2100; year++) {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear) {
                count++;
                System.out.print(year + (count % 10 == 0 ? "\n" : " "));
            }
        }
        System.out.println();
    }
}
