package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class D_Format {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy - E H:m a");
        DateTimeFormatter f2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(f);
        String myDate2 = dt.format(f2);

        System.out.println(myDate);
        System.out.println(myDate2);
    }
}
