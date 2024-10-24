package DateTime;

import java.util.Calendar;
import java.util.Date;

public class A_Time {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        //counts from 1st January 1970.

        Date a = new Date();
        System.out.println(a.getTime());
        System.out.println(a.getDate());
        System.out.println(a);

        Date d = new Date(124, Calendar.FEBRUARY, 7);
        System.out.println(d);
    }
}
