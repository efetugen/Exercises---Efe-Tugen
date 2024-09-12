package HW.chapter01.chapter07;

public class Q13 {
    public static void main(String[] args) {

    }

    public static int getRandom(int... numbers) {
        int number;
        boolean isExcluded;

        do {
            isExcluded = false;
            number = 1 + (int) (Math.random() * 5);

            for (int e : numbers) {
                if (number == e)
                    isExcluded = true;
            }
        } while (isExcluded);

        return number;
    }
}
