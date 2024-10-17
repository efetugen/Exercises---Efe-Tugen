package HW.chapter01.chapter09;

public class Q06 {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int[] randomArray = new int[100000];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100000);
        }

        stopWatch.start();

        selectionSort(randomArray);

        stopWatch.stop();

        System.out.println("The execution time of sorting 100,000 numbers using selection sort: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
    }

    public static class StopWatch {
        private long startTime;
        private long stopTime;

        public StopWatch() {
        }

        public void start() {
            startTime = System.currentTimeMillis();
        }

        public void stop() {
            stopTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return stopTime - startTime;
        }
    }
}
