package HW.chapter01.chapter06;

public class Q24 {
    public static void main(String[] args) {
        System.out.println(time());
        System.out.println(date());
        System.out.println(month());
        System.out.println(day());
    }

    public static String time() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        return (String) (currentHour + ":" + currentMinute + ":" + currentSecond);
    }

    public static String date() {
        return year() + "";
    }

    public static int year() {
        int currentYear = (int) (System.currentTimeMillis() / 3.15569E10) + 1970;
        return currentYear;
    }

    public static int month() {
        int currentMonth = (int) ((System.currentTimeMillis() % 3.15569E10) / 2.63E9);
        return currentMonth + 1;
    }

    public static int day() {
        return 0;
    }


}
