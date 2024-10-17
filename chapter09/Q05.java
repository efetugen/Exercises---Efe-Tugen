package HW.chapter01.chapter09;

import java.util.GregorianCalendar;

public class Q05 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println("Current year, month and day is:");
        System.out.println(calendar.get(GregorianCalendar.YEAR) + "/" + calendar.get(GregorianCalendar.MONTH) + "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH));

        calendar.setTimeInMillis(1234567898765L);
        System.out.println("Setted year, month and day is:");
        System.out.println(calendar.get(GregorianCalendar.YEAR) + "/" + calendar.get(GregorianCalendar.MONTH) + "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
