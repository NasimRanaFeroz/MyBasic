package DateTime;

import java.util.Calendar;
import java.util.TimeZone;

public class B_Calender {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
        Calendar c2 = Calendar.getInstance();

        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone().getID());

        System.out.println(c2.getTimeZone().getID());
        System.out.println(c2.get(Calendar.DATE));
        System.out.println(c2.get(Calendar.HOUR));
        System.out.println(c2.get(Calendar.HOUR_OF_DAY) + ":" + c2.get(Calendar.MINUTE));
    }
}
