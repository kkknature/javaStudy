package date1;

import java.util.Calendar;

public class CalendarEx02 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        cal.set(2025, 5-1, 1);
        System.out.println(cal.get(Calendar.YEAR));
    }
}
