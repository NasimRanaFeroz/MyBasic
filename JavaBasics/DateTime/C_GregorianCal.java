package DateTime;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class C_GregorianCal {
    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2024));

        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[123]);
        System.out.println(TimeZone.getAvailableIDs()[445]);
        System.out.println(TimeZone.getAvailableIDs()[563]);
    }
}
