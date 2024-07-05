package HW.chapter01.chapter05;

public class Q07 {
    public static void main(String[] args) {
        double tuition = 10_000;
        double increase = 0.05;
        int totalCost = 0;
        double tuitionAfter10Years = 0;

        for (int year = 1; year <= 14; year++) {
            tuition += tuition * increase;

            if (year > 10) {
                totalCost += tuition;
            }

            if (year == 10) {
                tuitionAfter10Years = tuition;
            }
        }

        System.out.println("Tuition in ten years: $" + tuitionAfter10Years);


        System.out.println("Total cost for four years' worth of tuition after the tenth year: $" +
                totalCost);

    }
}
